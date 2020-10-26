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

@Tag("36")
class Record_2801 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2801: FirstName is Delia")
	void FirstNameOfRecord2801() {
		assertEquals("Delia", customers.get(2800).getFirstName());
	}

	@Test
	@DisplayName("Record 2801: LastName is Bushlen")
	void LastNameOfRecord2801() {
		assertEquals("Bushlen", customers.get(2800).getLastName());
	}

	@Test
	@DisplayName("Record 2801: Company is Ross Sacks & Glazier")
	void CompanyOfRecord2801() {
		assertEquals("Ross Sacks & Glazier", customers.get(2800).getCompany());
	}

	@Test
	@DisplayName("Record 2801: Address is Niles Bg")
	void AddressOfRecord2801() {
		assertEquals("Niles Bg", customers.get(2800).getAddress());
	}

	@Test
	@DisplayName("Record 2801: City is Findlay")
	void CityOfRecord2801() {
		assertEquals("Findlay", customers.get(2800).getCity());
	}

	@Test
	@DisplayName("Record 2801: County is Hancock")
	void CountyOfRecord2801() {
		assertEquals("Hancock", customers.get(2800).getCounty());
	}

	@Test
	@DisplayName("Record 2801: State is OH")
	void StateOfRecord2801() {
		assertEquals("OH", customers.get(2800).getState());
	}

	@Test
	@DisplayName("Record 2801: ZIP is 45840")
	void ZIPOfRecord2801() {
		assertEquals("45840", customers.get(2800).getZIP());
	}

	@Test
	@DisplayName("Record 2801: Phone is 419-423-1828")
	void PhoneOfRecord2801() {
		assertEquals("419-423-1828", customers.get(2800).getPhone());
	}

	@Test
	@DisplayName("Record 2801: Fax is 419-423-6866")
	void FaxOfRecord2801() {
		assertEquals("419-423-6866", customers.get(2800).getFax());
	}

	@Test
	@DisplayName("Record 2801: Email is delia@bushlen.com")
	void EmailOfRecord2801() {
		assertEquals("delia@bushlen.com", customers.get(2800).getEmail());
	}

	@Test
	@DisplayName("Record 2801: Web is http://www.deliabushlen.com")
	void WebOfRecord2801() {
		assertEquals("http://www.deliabushlen.com", customers.get(2800).getWeb());
	}
}
