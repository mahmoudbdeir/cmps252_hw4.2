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

@Tag("46")
class Record_2781 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2781: FirstName is Tyron")
	void FirstNameOfRecord2781() {
		assertEquals("Tyron", customers.get(2780).getFirstName());
	}

	@Test
	@DisplayName("Record 2781: LastName is Hodos")
	void LastNameOfRecord2781() {
		assertEquals("Hodos", customers.get(2780).getLastName());
	}

	@Test
	@DisplayName("Record 2781: Company is Gallagher, Jeanne S Esq")
	void CompanyOfRecord2781() {
		assertEquals("Gallagher, Jeanne S Esq", customers.get(2780).getCompany());
	}

	@Test
	@DisplayName("Record 2781: Address is 729 Sunrise Ave")
	void AddressOfRecord2781() {
		assertEquals("729 Sunrise Ave", customers.get(2780).getAddress());
	}

	@Test
	@DisplayName("Record 2781: City is Roseville")
	void CityOfRecord2781() {
		assertEquals("Roseville", customers.get(2780).getCity());
	}

	@Test
	@DisplayName("Record 2781: County is Placer")
	void CountyOfRecord2781() {
		assertEquals("Placer", customers.get(2780).getCounty());
	}

	@Test
	@DisplayName("Record 2781: State is CA")
	void StateOfRecord2781() {
		assertEquals("CA", customers.get(2780).getState());
	}

	@Test
	@DisplayName("Record 2781: ZIP is 95661")
	void ZIPOfRecord2781() {
		assertEquals("95661", customers.get(2780).getZIP());
	}

	@Test
	@DisplayName("Record 2781: Phone is 916-781-0530")
	void PhoneOfRecord2781() {
		assertEquals("916-781-0530", customers.get(2780).getPhone());
	}

	@Test
	@DisplayName("Record 2781: Fax is 916-781-6251")
	void FaxOfRecord2781() {
		assertEquals("916-781-6251", customers.get(2780).getFax());
	}

	@Test
	@DisplayName("Record 2781: Email is tyron@hodos.com")
	void EmailOfRecord2781() {
		assertEquals("tyron@hodos.com", customers.get(2780).getEmail());
	}

	@Test
	@DisplayName("Record 2781: Web is http://www.tyronhodos.com")
	void WebOfRecord2781() {
		assertEquals("http://www.tyronhodos.com", customers.get(2780).getWeb());
	}
}
