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

@Tag("4")
class Record_4166 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4166: FirstName is Cristopher")
	void FirstNameOfRecord4166() {
		assertEquals("Cristopher", customers.get(4165).getFirstName());
	}

	@Test
	@DisplayName("Record 4166: LastName is Caggiano")
	void LastNameOfRecord4166() {
		assertEquals("Caggiano", customers.get(4165).getLastName());
	}

	@Test
	@DisplayName("Record 4166: Company is Koger, Randee Esq")
	void CompanyOfRecord4166() {
		assertEquals("Koger, Randee Esq", customers.get(4165).getCompany());
	}

	@Test
	@DisplayName("Record 4166: Address is 180 N Wacker Dr")
	void AddressOfRecord4166() {
		assertEquals("180 N Wacker Dr", customers.get(4165).getAddress());
	}

	@Test
	@DisplayName("Record 4166: City is Chicago")
	void CityOfRecord4166() {
		assertEquals("Chicago", customers.get(4165).getCity());
	}

	@Test
	@DisplayName("Record 4166: County is Cook")
	void CountyOfRecord4166() {
		assertEquals("Cook", customers.get(4165).getCounty());
	}

	@Test
	@DisplayName("Record 4166: State is IL")
	void StateOfRecord4166() {
		assertEquals("IL", customers.get(4165).getState());
	}

	@Test
	@DisplayName("Record 4166: ZIP is 60606")
	void ZIPOfRecord4166() {
		assertEquals("60606", customers.get(4165).getZIP());
	}

	@Test
	@DisplayName("Record 4166: Phone is 312-346-5458")
	void PhoneOfRecord4166() {
		assertEquals("312-346-5458", customers.get(4165).getPhone());
	}

	@Test
	@DisplayName("Record 4166: Fax is 312-346-4938")
	void FaxOfRecord4166() {
		assertEquals("312-346-4938", customers.get(4165).getFax());
	}

	@Test
	@DisplayName("Record 4166: Email is cristopher@caggiano.com")
	void EmailOfRecord4166() {
		assertEquals("cristopher@caggiano.com", customers.get(4165).getEmail());
	}

	@Test
	@DisplayName("Record 4166: Web is http://www.cristophercaggiano.com")
	void WebOfRecord4166() {
		assertEquals("http://www.cristophercaggiano.com", customers.get(4165).getWeb());
	}
}
