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

@Tag("25")
class Record_4500 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4500: FirstName is Ben")
	void FirstNameOfRecord4500() {
		assertEquals("Ben", customers.get(4499).getFirstName());
	}

	@Test
	@DisplayName("Record 4500: LastName is Demerson")
	void LastNameOfRecord4500() {
		assertEquals("Demerson", customers.get(4499).getLastName());
	}

	@Test
	@DisplayName("Record 4500: Company is Drapos, Alexander E Esq")
	void CompanyOfRecord4500() {
		assertEquals("Drapos, Alexander E Esq", customers.get(4499).getCompany());
	}

	@Test
	@DisplayName("Record 4500: Address is 9919 Rhode Island Ave")
	void AddressOfRecord4500() {
		assertEquals("9919 Rhode Island Ave", customers.get(4499).getAddress());
	}

	@Test
	@DisplayName("Record 4500: City is College Park")
	void CityOfRecord4500() {
		assertEquals("College Park", customers.get(4499).getCity());
	}

	@Test
	@DisplayName("Record 4500: County is Prince Georges")
	void CountyOfRecord4500() {
		assertEquals("Prince Georges", customers.get(4499).getCounty());
	}

	@Test
	@DisplayName("Record 4500: State is MD")
	void StateOfRecord4500() {
		assertEquals("MD", customers.get(4499).getState());
	}

	@Test
	@DisplayName("Record 4500: ZIP is 20740")
	void ZIPOfRecord4500() {
		assertEquals("20740", customers.get(4499).getZIP());
	}

	@Test
	@DisplayName("Record 4500: Phone is 301-441-7414")
	void PhoneOfRecord4500() {
		assertEquals("301-441-7414", customers.get(4499).getPhone());
	}

	@Test
	@DisplayName("Record 4500: Fax is 301-441-9678")
	void FaxOfRecord4500() {
		assertEquals("301-441-9678", customers.get(4499).getFax());
	}

	@Test
	@DisplayName("Record 4500: Email is ben@demerson.com")
	void EmailOfRecord4500() {
		assertEquals("ben@demerson.com", customers.get(4499).getEmail());
	}

	@Test
	@DisplayName("Record 4500: Web is http://www.bendemerson.com")
	void WebOfRecord4500() {
		assertEquals("http://www.bendemerson.com", customers.get(4499).getWeb());
	}
}
