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

@Tag("31")
class Record_3872 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3872: FirstName is Erin")
	void FirstNameOfRecord3872() {
		assertEquals("Erin", customers.get(3871).getFirstName());
	}

	@Test
	@DisplayName("Record 3872: LastName is Fobes")
	void LastNameOfRecord3872() {
		assertEquals("Fobes", customers.get(3871).getLastName());
	}

	@Test
	@DisplayName("Record 3872: Company is Sanders, Eric T Esq")
	void CompanyOfRecord3872() {
		assertEquals("Sanders, Eric T Esq", customers.get(3871).getCompany());
	}

	@Test
	@DisplayName("Record 3872: Address is Hwy 1")
	void AddressOfRecord3872() {
		assertEquals("Hwy 1", customers.get(3871).getAddress());
	}

	@Test
	@DisplayName("Record 3872: City is Graniteville")
	void CityOfRecord3872() {
		assertEquals("Graniteville", customers.get(3871).getCity());
	}

	@Test
	@DisplayName("Record 3872: County is Aiken")
	void CountyOfRecord3872() {
		assertEquals("Aiken", customers.get(3871).getCounty());
	}

	@Test
	@DisplayName("Record 3872: State is SC")
	void StateOfRecord3872() {
		assertEquals("SC", customers.get(3871).getState());
	}

	@Test
	@DisplayName("Record 3872: ZIP is 29829")
	void ZIPOfRecord3872() {
		assertEquals("29829", customers.get(3871).getZIP());
	}

	@Test
	@DisplayName("Record 3872: Phone is 803-663-4324")
	void PhoneOfRecord3872() {
		assertEquals("803-663-4324", customers.get(3871).getPhone());
	}

	@Test
	@DisplayName("Record 3872: Fax is 803-663-5441")
	void FaxOfRecord3872() {
		assertEquals("803-663-5441", customers.get(3871).getFax());
	}

	@Test
	@DisplayName("Record 3872: Email is erin@fobes.com")
	void EmailOfRecord3872() {
		assertEquals("erin@fobes.com", customers.get(3871).getEmail());
	}

	@Test
	@DisplayName("Record 3872: Web is http://www.erinfobes.com")
	void WebOfRecord3872() {
		assertEquals("http://www.erinfobes.com", customers.get(3871).getWeb());
	}
}
