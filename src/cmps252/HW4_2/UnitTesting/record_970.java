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

@Tag("2")
class Record_970 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 970: FirstName is Edgardo")
	void FirstNameOfRecord970() {
		assertEquals("Edgardo", customers.get(969).getFirstName());
	}

	@Test
	@DisplayName("Record 970: LastName is Lofts")
	void LastNameOfRecord970() {
		assertEquals("Lofts", customers.get(969).getLastName());
	}

	@Test
	@DisplayName("Record 970: Company is Association Communications Inc")
	void CompanyOfRecord970() {
		assertEquals("Association Communications Inc", customers.get(969).getCompany());
	}

	@Test
	@DisplayName("Record 970: Address is 4400 Macarthur Blvd")
	void AddressOfRecord970() {
		assertEquals("4400 Macarthur Blvd", customers.get(969).getAddress());
	}

	@Test
	@DisplayName("Record 970: City is Newport Beach")
	void CityOfRecord970() {
		assertEquals("Newport Beach", customers.get(969).getCity());
	}

	@Test
	@DisplayName("Record 970: County is Orange")
	void CountyOfRecord970() {
		assertEquals("Orange", customers.get(969).getCounty());
	}

	@Test
	@DisplayName("Record 970: State is CA")
	void StateOfRecord970() {
		assertEquals("CA", customers.get(969).getState());
	}

	@Test
	@DisplayName("Record 970: ZIP is 92660")
	void ZIPOfRecord970() {
		assertEquals("92660", customers.get(969).getZIP());
	}

	@Test
	@DisplayName("Record 970: Phone is 949-752-9062")
	void PhoneOfRecord970() {
		assertEquals("949-752-9062", customers.get(969).getPhone());
	}

	@Test
	@DisplayName("Record 970: Fax is 949-752-6113")
	void FaxOfRecord970() {
		assertEquals("949-752-6113", customers.get(969).getFax());
	}

	@Test
	@DisplayName("Record 970: Email is edgardo@lofts.com")
	void EmailOfRecord970() {
		assertEquals("edgardo@lofts.com", customers.get(969).getEmail());
	}

	@Test
	@DisplayName("Record 970: Web is http://www.edgardolofts.com")
	void WebOfRecord970() {
		assertEquals("http://www.edgardolofts.com", customers.get(969).getWeb());
	}
}
