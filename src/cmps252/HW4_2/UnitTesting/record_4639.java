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

@Tag("35")
class Record_4639 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4639: FirstName is Blanca")
	void FirstNameOfRecord4639() {
		assertEquals("Blanca", customers.get(4638).getFirstName());
	}

	@Test
	@DisplayName("Record 4639: LastName is Kinde")
	void LastNameOfRecord4639() {
		assertEquals("Kinde", customers.get(4638).getLastName());
	}

	@Test
	@DisplayName("Record 4639: Company is Monahan, Joseph C Esq")
	void CompanyOfRecord4639() {
		assertEquals("Monahan, Joseph C Esq", customers.get(4638).getCompany());
	}

	@Test
	@DisplayName("Record 4639: Address is 1003 Hugh Wallis Rd  #-b")
	void AddressOfRecord4639() {
		assertEquals("1003 Hugh Wallis Rd  #-b", customers.get(4638).getAddress());
	}

	@Test
	@DisplayName("Record 4639: City is Lafayette")
	void CityOfRecord4639() {
		assertEquals("Lafayette", customers.get(4638).getCity());
	}

	@Test
	@DisplayName("Record 4639: County is Lafayette")
	void CountyOfRecord4639() {
		assertEquals("Lafayette", customers.get(4638).getCounty());
	}

	@Test
	@DisplayName("Record 4639: State is LA")
	void StateOfRecord4639() {
		assertEquals("LA", customers.get(4638).getState());
	}

	@Test
	@DisplayName("Record 4639: ZIP is 70508")
	void ZIPOfRecord4639() {
		assertEquals("70508", customers.get(4638).getZIP());
	}

	@Test
	@DisplayName("Record 4639: Phone is 337-237-6409")
	void PhoneOfRecord4639() {
		assertEquals("337-237-6409", customers.get(4638).getPhone());
	}

	@Test
	@DisplayName("Record 4639: Fax is 337-237-8756")
	void FaxOfRecord4639() {
		assertEquals("337-237-8756", customers.get(4638).getFax());
	}

	@Test
	@DisplayName("Record 4639: Email is blanca@kinde.com")
	void EmailOfRecord4639() {
		assertEquals("blanca@kinde.com", customers.get(4638).getEmail());
	}

	@Test
	@DisplayName("Record 4639: Web is http://www.blancakinde.com")
	void WebOfRecord4639() {
		assertEquals("http://www.blancakinde.com", customers.get(4638).getWeb());
	}
}
