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

@Tag("43")
class Record_755 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 755: FirstName is Barbara")
	void FirstNameOfRecord755() {
		assertEquals("Barbara", customers.get(754).getFirstName());
	}

	@Test
	@DisplayName("Record 755: LastName is Stehle")
	void LastNameOfRecord755() {
		assertEquals("Stehle", customers.get(754).getLastName());
	}

	@Test
	@DisplayName("Record 755: Company is Harpring, Michael R Esq")
	void CompanyOfRecord755() {
		assertEquals("Harpring, Michael R Esq", customers.get(754).getCompany());
	}

	@Test
	@DisplayName("Record 755: Address is 30600 Telegraph Rd")
	void AddressOfRecord755() {
		assertEquals("30600 Telegraph Rd", customers.get(754).getAddress());
	}

	@Test
	@DisplayName("Record 755: City is Franklin")
	void CityOfRecord755() {
		assertEquals("Franklin", customers.get(754).getCity());
	}

	@Test
	@DisplayName("Record 755: County is Oakland")
	void CountyOfRecord755() {
		assertEquals("Oakland", customers.get(754).getCounty());
	}

	@Test
	@DisplayName("Record 755: State is MI")
	void StateOfRecord755() {
		assertEquals("MI", customers.get(754).getState());
	}

	@Test
	@DisplayName("Record 755: ZIP is 48025")
	void ZIPOfRecord755() {
		assertEquals("48025", customers.get(754).getZIP());
	}

	@Test
	@DisplayName("Record 755: Phone is 248-647-4445")
	void PhoneOfRecord755() {
		assertEquals("248-647-4445", customers.get(754).getPhone());
	}

	@Test
	@DisplayName("Record 755: Fax is 248-647-9978")
	void FaxOfRecord755() {
		assertEquals("248-647-9978", customers.get(754).getFax());
	}

	@Test
	@DisplayName("Record 755: Email is barbara@stehle.com")
	void EmailOfRecord755() {
		assertEquals("barbara@stehle.com", customers.get(754).getEmail());
	}

	@Test
	@DisplayName("Record 755: Web is http://www.barbarastehle.com")
	void WebOfRecord755() {
		assertEquals("http://www.barbarastehle.com", customers.get(754).getWeb());
	}
}
