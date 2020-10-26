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

@Tag("33")
class Record_3930 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3930: FirstName is Brenton")
	void FirstNameOfRecord3930() {
		assertEquals("Brenton", customers.get(3929).getFirstName());
	}

	@Test
	@DisplayName("Record 3930: LastName is Baiera")
	void LastNameOfRecord3930() {
		assertEquals("Baiera", customers.get(3929).getLastName());
	}

	@Test
	@DisplayName("Record 3930: Company is Millbrae Stationers")
	void CompanyOfRecord3930() {
		assertEquals("Millbrae Stationers", customers.get(3929).getCompany());
	}

	@Test
	@DisplayName("Record 3930: Address is 35 E Wacker Dr  #-900")
	void AddressOfRecord3930() {
		assertEquals("35 E Wacker Dr  #-900", customers.get(3929).getAddress());
	}

	@Test
	@DisplayName("Record 3930: City is Chicago")
	void CityOfRecord3930() {
		assertEquals("Chicago", customers.get(3929).getCity());
	}

	@Test
	@DisplayName("Record 3930: County is Cook")
	void CountyOfRecord3930() {
		assertEquals("Cook", customers.get(3929).getCounty());
	}

	@Test
	@DisplayName("Record 3930: State is IL")
	void StateOfRecord3930() {
		assertEquals("IL", customers.get(3929).getState());
	}

	@Test
	@DisplayName("Record 3930: ZIP is 60601")
	void ZIPOfRecord3930() {
		assertEquals("60601", customers.get(3929).getZIP());
	}

	@Test
	@DisplayName("Record 3930: Phone is 312-781-9292")
	void PhoneOfRecord3930() {
		assertEquals("312-781-9292", customers.get(3929).getPhone());
	}

	@Test
	@DisplayName("Record 3930: Fax is 312-781-0597")
	void FaxOfRecord3930() {
		assertEquals("312-781-0597", customers.get(3929).getFax());
	}

	@Test
	@DisplayName("Record 3930: Email is brenton@baiera.com")
	void EmailOfRecord3930() {
		assertEquals("brenton@baiera.com", customers.get(3929).getEmail());
	}

	@Test
	@DisplayName("Record 3930: Web is http://www.brentonbaiera.com")
	void WebOfRecord3930() {
		assertEquals("http://www.brentonbaiera.com", customers.get(3929).getWeb());
	}
}
