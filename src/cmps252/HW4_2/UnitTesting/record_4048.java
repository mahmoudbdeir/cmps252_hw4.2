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

@Tag("39")
class Record_4048 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4048: FirstName is Millicent")
	void FirstNameOfRecord4048() {
		assertEquals("Millicent", customers.get(4047).getFirstName());
	}

	@Test
	@DisplayName("Record 4048: LastName is Ebanks")
	void LastNameOfRecord4048() {
		assertEquals("Ebanks", customers.get(4047).getLastName());
	}

	@Test
	@DisplayName("Record 4048: Company is Holleman, Paul F Esq")
	void CompanyOfRecord4048() {
		assertEquals("Holleman, Paul F Esq", customers.get(4047).getCompany());
	}

	@Test
	@DisplayName("Record 4048: Address is 180 Old York Rd")
	void AddressOfRecord4048() {
		assertEquals("180 Old York Rd", customers.get(4047).getAddress());
	}

	@Test
	@DisplayName("Record 4048: City is Jenkintown")
	void CityOfRecord4048() {
		assertEquals("Jenkintown", customers.get(4047).getCity());
	}

	@Test
	@DisplayName("Record 4048: County is Montgomery")
	void CountyOfRecord4048() {
		assertEquals("Montgomery", customers.get(4047).getCounty());
	}

	@Test
	@DisplayName("Record 4048: State is PA")
	void StateOfRecord4048() {
		assertEquals("PA", customers.get(4047).getState());
	}

	@Test
	@DisplayName("Record 4048: ZIP is 19046")
	void ZIPOfRecord4048() {
		assertEquals("19046", customers.get(4047).getZIP());
	}

	@Test
	@DisplayName("Record 4048: Phone is 215-887-1281")
	void PhoneOfRecord4048() {
		assertEquals("215-887-1281", customers.get(4047).getPhone());
	}

	@Test
	@DisplayName("Record 4048: Fax is 215-887-3976")
	void FaxOfRecord4048() {
		assertEquals("215-887-3976", customers.get(4047).getFax());
	}

	@Test
	@DisplayName("Record 4048: Email is millicent@ebanks.com")
	void EmailOfRecord4048() {
		assertEquals("millicent@ebanks.com", customers.get(4047).getEmail());
	}

	@Test
	@DisplayName("Record 4048: Web is http://www.millicentebanks.com")
	void WebOfRecord4048() {
		assertEquals("http://www.millicentebanks.com", customers.get(4047).getWeb());
	}
}
