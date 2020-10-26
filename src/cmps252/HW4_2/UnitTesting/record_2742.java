package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("42")
class Record_2742 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2742: FirstName is Amalia")
	void FirstNameOfRecord2742() {
		assertEquals("Amalia", customers.get(2741).getFirstName());
	}

	@Test
	@DisplayName("Record 2742: LastName is Sebestyen")
	void LastNameOfRecord2742() {
		assertEquals("Sebestyen", customers.get(2741).getLastName());
	}

	@Test
	@DisplayName("Record 2742: Company is Western Drug")
	void CompanyOfRecord2742() {
		assertEquals("Western Drug", customers.get(2741).getCompany());
	}

	@Test
	@DisplayName("Record 2742: Address is 20 Winthrop Sq")
	void AddressOfRecord2742() {
		assertEquals("20 Winthrop Sq", customers.get(2741).getAddress());
	}

	@Test
	@DisplayName("Record 2742: City is Boston")
	void CityOfRecord2742() {
		assertEquals("Boston", customers.get(2741).getCity());
	}

	@Test
	@DisplayName("Record 2742: County is Suffolk")
	void CountyOfRecord2742() {
		assertEquals("Suffolk", customers.get(2741).getCounty());
	}

	@Test
	@DisplayName("Record 2742: State is MA")
	void StateOfRecord2742() {
		assertEquals("MA", customers.get(2741).getState());
	}

	@Test
	@DisplayName("Record 2742: ZIP is 2110")
	void ZIPOfRecord2742() {
		assertEquals("2110", customers.get(2741).getZIP());
	}

	@Test
	@DisplayName("Record 2742: Phone is 617-345-5341")
	void PhoneOfRecord2742() {
		assertEquals("617-345-5341", customers.get(2741).getPhone());
	}

	@Test
	@DisplayName("Record 2742: Fax is 617-345-2774")
	void FaxOfRecord2742() {
		assertEquals("617-345-2774", customers.get(2741).getFax());
	}

	@Test
	@DisplayName("Record 2742: Email is amalia@sebestyen.com")
	void EmailOfRecord2742() {
		assertEquals("amalia@sebestyen.com", customers.get(2741).getEmail());
	}

	@Test
	@DisplayName("Record 2742: Web is http://www.amaliasebestyen.com")
	void WebOfRecord2742() {
		assertEquals("http://www.amaliasebestyen.com", customers.get(2741).getWeb());
	}
}
