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

@Tag("11")
class Record_1170 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1170: FirstName is Blake")
	void FirstNameOfRecord1170() {
		assertEquals("Blake", customers.get(1169).getFirstName());
	}

	@Test
	@DisplayName("Record 1170: LastName is Byles")
	void LastNameOfRecord1170() {
		assertEquals("Byles", customers.get(1169).getLastName());
	}

	@Test
	@DisplayName("Record 1170: Company is Kelley, Gerald E Esq")
	void CompanyOfRecord1170() {
		assertEquals("Kelley, Gerald E Esq", customers.get(1169).getCompany());
	}

	@Test
	@DisplayName("Record 1170: Address is Cudworth Rd")
	void AddressOfRecord1170() {
		assertEquals("Cudworth Rd", customers.get(1169).getAddress());
	}

	@Test
	@DisplayName("Record 1170: City is Oxford")
	void CityOfRecord1170() {
		assertEquals("Oxford", customers.get(1169).getCity());
	}

	@Test
	@DisplayName("Record 1170: County is Worcester")
	void CountyOfRecord1170() {
		assertEquals("Worcester", customers.get(1169).getCounty());
	}

	@Test
	@DisplayName("Record 1170: State is MA")
	void StateOfRecord1170() {
		assertEquals("MA", customers.get(1169).getState());
	}

	@Test
	@DisplayName("Record 1170: ZIP is 1540")
	void ZIPOfRecord1170() {
		assertEquals("1540", customers.get(1169).getZIP());
	}

	@Test
	@DisplayName("Record 1170: Phone is 508-987-3359")
	void PhoneOfRecord1170() {
		assertEquals("508-987-3359", customers.get(1169).getPhone());
	}

	@Test
	@DisplayName("Record 1170: Fax is 508-987-4042")
	void FaxOfRecord1170() {
		assertEquals("508-987-4042", customers.get(1169).getFax());
	}

	@Test
	@DisplayName("Record 1170: Email is blake@byles.com")
	void EmailOfRecord1170() {
		assertEquals("blake@byles.com", customers.get(1169).getEmail());
	}

	@Test
	@DisplayName("Record 1170: Web is http://www.blakebyles.com")
	void WebOfRecord1170() {
		assertEquals("http://www.blakebyles.com", customers.get(1169).getWeb());
	}
}
