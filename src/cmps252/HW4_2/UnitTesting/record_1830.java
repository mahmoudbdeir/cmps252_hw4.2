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
class Record_1830 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1830: FirstName is Jana")
	void FirstNameOfRecord1830() {
		assertEquals("Jana", customers.get(1829).getFirstName());
	}

	@Test
	@DisplayName("Record 1830: LastName is Bruenderman")
	void LastNameOfRecord1830() {
		assertEquals("Bruenderman", customers.get(1829).getLastName());
	}

	@Test
	@DisplayName("Record 1830: Company is Lavoie, John G Esq")
	void CompanyOfRecord1830() {
		assertEquals("Lavoie, John G Esq", customers.get(1829).getCompany());
	}

	@Test
	@DisplayName("Record 1830: Address is 1062 Central Ave")
	void AddressOfRecord1830() {
		assertEquals("1062 Central Ave", customers.get(1829).getAddress());
	}

	@Test
	@DisplayName("Record 1830: City is Albany")
	void CityOfRecord1830() {
		assertEquals("Albany", customers.get(1829).getCity());
	}

	@Test
	@DisplayName("Record 1830: County is Albany")
	void CountyOfRecord1830() {
		assertEquals("Albany", customers.get(1829).getCounty());
	}

	@Test
	@DisplayName("Record 1830: State is NY")
	void StateOfRecord1830() {
		assertEquals("NY", customers.get(1829).getState());
	}

	@Test
	@DisplayName("Record 1830: ZIP is 12205")
	void ZIPOfRecord1830() {
		assertEquals("12205", customers.get(1829).getZIP());
	}

	@Test
	@DisplayName("Record 1830: Phone is 518-459-4089")
	void PhoneOfRecord1830() {
		assertEquals("518-459-4089", customers.get(1829).getPhone());
	}

	@Test
	@DisplayName("Record 1830: Fax is 518-459-0283")
	void FaxOfRecord1830() {
		assertEquals("518-459-0283", customers.get(1829).getFax());
	}

	@Test
	@DisplayName("Record 1830: Email is jana@bruenderman.com")
	void EmailOfRecord1830() {
		assertEquals("jana@bruenderman.com", customers.get(1829).getEmail());
	}

	@Test
	@DisplayName("Record 1830: Web is http://www.janabruenderman.com")
	void WebOfRecord1830() {
		assertEquals("http://www.janabruenderman.com", customers.get(1829).getWeb());
	}
}
