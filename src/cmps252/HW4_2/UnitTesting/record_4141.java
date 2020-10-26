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
class Record_4141 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4141: FirstName is Rosanne")
	void FirstNameOfRecord4141() {
		assertEquals("Rosanne", customers.get(4140).getFirstName());
	}

	@Test
	@DisplayName("Record 4141: LastName is Potier")
	void LastNameOfRecord4141() {
		assertEquals("Potier", customers.get(4140).getLastName());
	}

	@Test
	@DisplayName("Record 4141: Company is Hall, Carl D Jr")
	void CompanyOfRecord4141() {
		assertEquals("Hall, Carl D Jr", customers.get(4140).getCompany());
	}

	@Test
	@DisplayName("Record 4141: Address is 2 N Charles St  #-700")
	void AddressOfRecord4141() {
		assertEquals("2 N Charles St  #-700", customers.get(4140).getAddress());
	}

	@Test
	@DisplayName("Record 4141: City is Baltimore")
	void CityOfRecord4141() {
		assertEquals("Baltimore", customers.get(4140).getCity());
	}

	@Test
	@DisplayName("Record 4141: County is Baltimore City")
	void CountyOfRecord4141() {
		assertEquals("Baltimore City", customers.get(4140).getCounty());
	}

	@Test
	@DisplayName("Record 4141: State is MD")
	void StateOfRecord4141() {
		assertEquals("MD", customers.get(4140).getState());
	}

	@Test
	@DisplayName("Record 4141: ZIP is 21201")
	void ZIPOfRecord4141() {
		assertEquals("21201", customers.get(4140).getZIP());
	}

	@Test
	@DisplayName("Record 4141: Phone is 410-625-9536")
	void PhoneOfRecord4141() {
		assertEquals("410-625-9536", customers.get(4140).getPhone());
	}

	@Test
	@DisplayName("Record 4141: Fax is 410-625-3123")
	void FaxOfRecord4141() {
		assertEquals("410-625-3123", customers.get(4140).getFax());
	}

	@Test
	@DisplayName("Record 4141: Email is rosanne@potier.com")
	void EmailOfRecord4141() {
		assertEquals("rosanne@potier.com", customers.get(4140).getEmail());
	}

	@Test
	@DisplayName("Record 4141: Web is http://www.rosannepotier.com")
	void WebOfRecord4141() {
		assertEquals("http://www.rosannepotier.com", customers.get(4140).getWeb());
	}
}
