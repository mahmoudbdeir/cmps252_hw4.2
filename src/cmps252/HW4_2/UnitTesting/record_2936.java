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

@Tag("44")
class Record_2936 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2936: FirstName is Truman")
	void FirstNameOfRecord2936() {
		assertEquals("Truman", customers.get(2935).getFirstName());
	}

	@Test
	@DisplayName("Record 2936: LastName is Ladson")
	void LastNameOfRecord2936() {
		assertEquals("Ladson", customers.get(2935).getLastName());
	}

	@Test
	@DisplayName("Record 2936: Company is Golbrook Lankes & Macmillan")
	void CompanyOfRecord2936() {
		assertEquals("Golbrook Lankes & Macmillan", customers.get(2935).getCompany());
	}

	@Test
	@DisplayName("Record 2936: Address is 163 Route 37 W")
	void AddressOfRecord2936() {
		assertEquals("163 Route 37 W", customers.get(2935).getAddress());
	}

	@Test
	@DisplayName("Record 2936: City is Toms River")
	void CityOfRecord2936() {
		assertEquals("Toms River", customers.get(2935).getCity());
	}

	@Test
	@DisplayName("Record 2936: County is Ocean")
	void CountyOfRecord2936() {
		assertEquals("Ocean", customers.get(2935).getCounty());
	}

	@Test
	@DisplayName("Record 2936: State is NJ")
	void StateOfRecord2936() {
		assertEquals("NJ", customers.get(2935).getState());
	}

	@Test
	@DisplayName("Record 2936: ZIP is 8755")
	void ZIPOfRecord2936() {
		assertEquals("8755", customers.get(2935).getZIP());
	}

	@Test
	@DisplayName("Record 2936: Phone is 732-244-1118")
	void PhoneOfRecord2936() {
		assertEquals("732-244-1118", customers.get(2935).getPhone());
	}

	@Test
	@DisplayName("Record 2936: Fax is 732-244-9566")
	void FaxOfRecord2936() {
		assertEquals("732-244-9566", customers.get(2935).getFax());
	}

	@Test
	@DisplayName("Record 2936: Email is truman@ladson.com")
	void EmailOfRecord2936() {
		assertEquals("truman@ladson.com", customers.get(2935).getEmail());
	}

	@Test
	@DisplayName("Record 2936: Web is http://www.trumanladson.com")
	void WebOfRecord2936() {
		assertEquals("http://www.trumanladson.com", customers.get(2935).getWeb());
	}
}
