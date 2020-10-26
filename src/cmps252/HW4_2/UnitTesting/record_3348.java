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
class Record_3348 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3348: FirstName is Athena")
	void FirstNameOfRecord3348() {
		assertEquals("Athena", customers.get(3347).getFirstName());
	}

	@Test
	@DisplayName("Record 3348: LastName is Andriopulos")
	void LastNameOfRecord3348() {
		assertEquals("Andriopulos", customers.get(3347).getLastName());
	}

	@Test
	@DisplayName("Record 3348: Company is Aycock, Lynda R Esq")
	void CompanyOfRecord3348() {
		assertEquals("Aycock, Lynda R Esq", customers.get(3347).getCompany());
	}

	@Test
	@DisplayName("Record 3348: Address is 8550 Lee Hwy  #-600")
	void AddressOfRecord3348() {
		assertEquals("8550 Lee Hwy  #-600", customers.get(3347).getAddress());
	}

	@Test
	@DisplayName("Record 3348: City is Fairfax")
	void CityOfRecord3348() {
		assertEquals("Fairfax", customers.get(3347).getCity());
	}

	@Test
	@DisplayName("Record 3348: County is Fairfax")
	void CountyOfRecord3348() {
		assertEquals("Fairfax", customers.get(3347).getCounty());
	}

	@Test
	@DisplayName("Record 3348: State is VA")
	void StateOfRecord3348() {
		assertEquals("VA", customers.get(3347).getState());
	}

	@Test
	@DisplayName("Record 3348: ZIP is 22031")
	void ZIPOfRecord3348() {
		assertEquals("22031", customers.get(3347).getZIP());
	}

	@Test
	@DisplayName("Record 3348: Phone is 703-573-9571")
	void PhoneOfRecord3348() {
		assertEquals("703-573-9571", customers.get(3347).getPhone());
	}

	@Test
	@DisplayName("Record 3348: Fax is 703-573-8453")
	void FaxOfRecord3348() {
		assertEquals("703-573-8453", customers.get(3347).getFax());
	}

	@Test
	@DisplayName("Record 3348: Email is athena@andriopulos.com")
	void EmailOfRecord3348() {
		assertEquals("athena@andriopulos.com", customers.get(3347).getEmail());
	}

	@Test
	@DisplayName("Record 3348: Web is http://www.athenaandriopulos.com")
	void WebOfRecord3348() {
		assertEquals("http://www.athenaandriopulos.com", customers.get(3347).getWeb());
	}
}
