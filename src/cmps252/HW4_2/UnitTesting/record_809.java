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

@Tag("28")
class Record_809 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 809: FirstName is Yvette")
	void FirstNameOfRecord809() {
		assertEquals("Yvette", customers.get(808).getFirstName());
	}

	@Test
	@DisplayName("Record 809: LastName is Falconer")
	void LastNameOfRecord809() {
		assertEquals("Falconer", customers.get(808).getLastName());
	}

	@Test
	@DisplayName("Record 809: Company is Custom Sign Company")
	void CompanyOfRecord809() {
		assertEquals("Custom Sign Company", customers.get(808).getCompany());
	}

	@Test
	@DisplayName("Record 809: Address is 790 W Shaw Ave  #-255")
	void AddressOfRecord809() {
		assertEquals("790 W Shaw Ave  #-255", customers.get(808).getAddress());
	}

	@Test
	@DisplayName("Record 809: City is Fresno")
	void CityOfRecord809() {
		assertEquals("Fresno", customers.get(808).getCity());
	}

	@Test
	@DisplayName("Record 809: County is Fresno")
	void CountyOfRecord809() {
		assertEquals("Fresno", customers.get(808).getCounty());
	}

	@Test
	@DisplayName("Record 809: State is CA")
	void StateOfRecord809() {
		assertEquals("CA", customers.get(808).getState());
	}

	@Test
	@DisplayName("Record 809: ZIP is 93704")
	void ZIPOfRecord809() {
		assertEquals("93704", customers.get(808).getZIP());
	}

	@Test
	@DisplayName("Record 809: Phone is 559-229-8250")
	void PhoneOfRecord809() {
		assertEquals("559-229-8250", customers.get(808).getPhone());
	}

	@Test
	@DisplayName("Record 809: Fax is 559-229-5992")
	void FaxOfRecord809() {
		assertEquals("559-229-5992", customers.get(808).getFax());
	}

	@Test
	@DisplayName("Record 809: Email is yvette@falconer.com")
	void EmailOfRecord809() {
		assertEquals("yvette@falconer.com", customers.get(808).getEmail());
	}

	@Test
	@DisplayName("Record 809: Web is http://www.yvettefalconer.com")
	void WebOfRecord809() {
		assertEquals("http://www.yvettefalconer.com", customers.get(808).getWeb());
	}
}
