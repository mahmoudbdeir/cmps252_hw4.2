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

@Tag("41")
class Record_936 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 936: FirstName is Paulina")
	void FirstNameOfRecord936() {
		assertEquals("Paulina", customers.get(935).getFirstName());
	}

	@Test
	@DisplayName("Record 936: LastName is Werthymer")
	void LastNameOfRecord936() {
		assertEquals("Werthymer", customers.get(935).getLastName());
	}

	@Test
	@DisplayName("Record 936: Company is Keller & Kirkpatrick")
	void CompanyOfRecord936() {
		assertEquals("Keller & Kirkpatrick", customers.get(935).getCompany());
	}

	@Test
	@DisplayName("Record 936: Address is 69 W Washington St")
	void AddressOfRecord936() {
		assertEquals("69 W Washington St", customers.get(935).getAddress());
	}

	@Test
	@DisplayName("Record 936: City is Chicago")
	void CityOfRecord936() {
		assertEquals("Chicago", customers.get(935).getCity());
	}

	@Test
	@DisplayName("Record 936: County is Cook")
	void CountyOfRecord936() {
		assertEquals("Cook", customers.get(935).getCounty());
	}

	@Test
	@DisplayName("Record 936: State is IL")
	void StateOfRecord936() {
		assertEquals("IL", customers.get(935).getState());
	}

	@Test
	@DisplayName("Record 936: ZIP is 60602")
	void ZIPOfRecord936() {
		assertEquals("60602", customers.get(935).getZIP());
	}

	@Test
	@DisplayName("Record 936: Phone is 312-408-2083")
	void PhoneOfRecord936() {
		assertEquals("312-408-2083", customers.get(935).getPhone());
	}

	@Test
	@DisplayName("Record 936: Fax is 312-408-3295")
	void FaxOfRecord936() {
		assertEquals("312-408-3295", customers.get(935).getFax());
	}

	@Test
	@DisplayName("Record 936: Email is paulina@werthymer.com")
	void EmailOfRecord936() {
		assertEquals("paulina@werthymer.com", customers.get(935).getEmail());
	}

	@Test
	@DisplayName("Record 936: Web is http://www.paulinawerthymer.com")
	void WebOfRecord936() {
		assertEquals("http://www.paulinawerthymer.com", customers.get(935).getWeb());
	}
}
