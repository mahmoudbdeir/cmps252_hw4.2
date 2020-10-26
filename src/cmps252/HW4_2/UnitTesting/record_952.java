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

@Tag("27")
class Record_952 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 952: FirstName is Annette")
	void FirstNameOfRecord952() {
		assertEquals("Annette", customers.get(951).getFirstName());
	}

	@Test
	@DisplayName("Record 952: LastName is Gautier")
	void LastNameOfRecord952() {
		assertEquals("Gautier", customers.get(951).getLastName());
	}

	@Test
	@DisplayName("Record 952: Company is Kirschner, Michael Paul Esq")
	void CompanyOfRecord952() {
		assertEquals("Kirschner, Michael Paul Esq", customers.get(951).getCompany());
	}

	@Test
	@DisplayName("Record 952: Address is Altamonte")
	void AddressOfRecord952() {
		assertEquals("Altamonte", customers.get(951).getAddress());
	}

	@Test
	@DisplayName("Record 952: City is Altamonte Springs")
	void CityOfRecord952() {
		assertEquals("Altamonte Springs", customers.get(951).getCity());
	}

	@Test
	@DisplayName("Record 952: County is Seminole")
	void CountyOfRecord952() {
		assertEquals("Seminole", customers.get(951).getCounty());
	}

	@Test
	@DisplayName("Record 952: State is FL")
	void StateOfRecord952() {
		assertEquals("FL", customers.get(951).getState());
	}

	@Test
	@DisplayName("Record 952: ZIP is 32701")
	void ZIPOfRecord952() {
		assertEquals("32701", customers.get(951).getZIP());
	}

	@Test
	@DisplayName("Record 952: Phone is 407-843-0971")
	void PhoneOfRecord952() {
		assertEquals("407-843-0971", customers.get(951).getPhone());
	}

	@Test
	@DisplayName("Record 952: Fax is 407-843-2941")
	void FaxOfRecord952() {
		assertEquals("407-843-2941", customers.get(951).getFax());
	}

	@Test
	@DisplayName("Record 952: Email is annette@gautier.com")
	void EmailOfRecord952() {
		assertEquals("annette@gautier.com", customers.get(951).getEmail());
	}

	@Test
	@DisplayName("Record 952: Web is http://www.annettegautier.com")
	void WebOfRecord952() {
		assertEquals("http://www.annettegautier.com", customers.get(951).getWeb());
	}
}
