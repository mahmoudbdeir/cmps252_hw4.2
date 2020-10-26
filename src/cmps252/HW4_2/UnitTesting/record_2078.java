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
class Record_2078 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2078: FirstName is Shanna")
	void FirstNameOfRecord2078() {
		assertEquals("Shanna", customers.get(2077).getFirstName());
	}

	@Test
	@DisplayName("Record 2078: LastName is Rawley")
	void LastNameOfRecord2078() {
		assertEquals("Rawley", customers.get(2077).getLastName());
	}

	@Test
	@DisplayName("Record 2078: Company is Space Power Electronics Inc")
	void CompanyOfRecord2078() {
		assertEquals("Space Power Electronics Inc", customers.get(2077).getCompany());
	}

	@Test
	@DisplayName("Record 2078: Address is 6911 Breen Dr")
	void AddressOfRecord2078() {
		assertEquals("6911 Breen Dr", customers.get(2077).getAddress());
	}

	@Test
	@DisplayName("Record 2078: City is Houston")
	void CityOfRecord2078() {
		assertEquals("Houston", customers.get(2077).getCity());
	}

	@Test
	@DisplayName("Record 2078: County is Harris")
	void CountyOfRecord2078() {
		assertEquals("Harris", customers.get(2077).getCounty());
	}

	@Test
	@DisplayName("Record 2078: State is TX")
	void StateOfRecord2078() {
		assertEquals("TX", customers.get(2077).getState());
	}

	@Test
	@DisplayName("Record 2078: ZIP is 77086")
	void ZIPOfRecord2078() {
		assertEquals("77086", customers.get(2077).getZIP());
	}

	@Test
	@DisplayName("Record 2078: Phone is 713-820-0345")
	void PhoneOfRecord2078() {
		assertEquals("713-820-0345", customers.get(2077).getPhone());
	}

	@Test
	@DisplayName("Record 2078: Fax is 713-820-5861")
	void FaxOfRecord2078() {
		assertEquals("713-820-5861", customers.get(2077).getFax());
	}

	@Test
	@DisplayName("Record 2078: Email is shanna@rawley.com")
	void EmailOfRecord2078() {
		assertEquals("shanna@rawley.com", customers.get(2077).getEmail());
	}

	@Test
	@DisplayName("Record 2078: Web is http://www.shannarawley.com")
	void WebOfRecord2078() {
		assertEquals("http://www.shannarawley.com", customers.get(2077).getWeb());
	}
}
