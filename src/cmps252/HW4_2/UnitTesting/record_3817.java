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

@Tag("19")
class Record_3817 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3817: FirstName is Kerry")
	void FirstNameOfRecord3817() {
		assertEquals("Kerry", customers.get(3816).getFirstName());
	}

	@Test
	@DisplayName("Record 3817: LastName is Ehmer")
	void LastNameOfRecord3817() {
		assertEquals("Ehmer", customers.get(3816).getLastName());
	}

	@Test
	@DisplayName("Record 3817: Company is Richard C Drayson Cpa Inc")
	void CompanyOfRecord3817() {
		assertEquals("Richard C Drayson Cpa Inc", customers.get(3816).getCompany());
	}

	@Test
	@DisplayName("Record 3817: Address is 8062 Main St")
	void AddressOfRecord3817() {
		assertEquals("8062 Main St", customers.get(3816).getAddress());
	}

	@Test
	@DisplayName("Record 3817: City is Stanton")
	void CityOfRecord3817() {
		assertEquals("Stanton", customers.get(3816).getCity());
	}

	@Test
	@DisplayName("Record 3817: County is Orange")
	void CountyOfRecord3817() {
		assertEquals("Orange", customers.get(3816).getCounty());
	}

	@Test
	@DisplayName("Record 3817: State is CA")
	void StateOfRecord3817() {
		assertEquals("CA", customers.get(3816).getState());
	}

	@Test
	@DisplayName("Record 3817: ZIP is 90680")
	void ZIPOfRecord3817() {
		assertEquals("90680", customers.get(3816).getZIP());
	}

	@Test
	@DisplayName("Record 3817: Phone is 714-827-7021")
	void PhoneOfRecord3817() {
		assertEquals("714-827-7021", customers.get(3816).getPhone());
	}

	@Test
	@DisplayName("Record 3817: Fax is 714-827-5934")
	void FaxOfRecord3817() {
		assertEquals("714-827-5934", customers.get(3816).getFax());
	}

	@Test
	@DisplayName("Record 3817: Email is kerry@ehmer.com")
	void EmailOfRecord3817() {
		assertEquals("kerry@ehmer.com", customers.get(3816).getEmail());
	}

	@Test
	@DisplayName("Record 3817: Web is http://www.kerryehmer.com")
	void WebOfRecord3817() {
		assertEquals("http://www.kerryehmer.com", customers.get(3816).getWeb());
	}
}
