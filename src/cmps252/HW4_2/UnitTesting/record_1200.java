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

@Tag("26")
class Record_1200 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1200: FirstName is Joel")
	void FirstNameOfRecord1200() {
		assertEquals("Joel", customers.get(1199).getFirstName());
	}

	@Test
	@DisplayName("Record 1200: LastName is Galam")
	void LastNameOfRecord1200() {
		assertEquals("Galam", customers.get(1199).getLastName());
	}

	@Test
	@DisplayName("Record 1200: Company is Yerba Prima")
	void CompanyOfRecord1200() {
		assertEquals("Yerba Prima", customers.get(1199).getCompany());
	}

	@Test
	@DisplayName("Record 1200: Address is 248 Elmwood Dr")
	void AddressOfRecord1200() {
		assertEquals("248 Elmwood Dr", customers.get(1199).getAddress());
	}

	@Test
	@DisplayName("Record 1200: City is Parsippany")
	void CityOfRecord1200() {
		assertEquals("Parsippany", customers.get(1199).getCity());
	}

	@Test
	@DisplayName("Record 1200: County is Morris")
	void CountyOfRecord1200() {
		assertEquals("Morris", customers.get(1199).getCounty());
	}

	@Test
	@DisplayName("Record 1200: State is NJ")
	void StateOfRecord1200() {
		assertEquals("NJ", customers.get(1199).getState());
	}

	@Test
	@DisplayName("Record 1200: ZIP is 7054")
	void ZIPOfRecord1200() {
		assertEquals("7054", customers.get(1199).getZIP());
	}

	@Test
	@DisplayName("Record 1200: Phone is 973-386-9420")
	void PhoneOfRecord1200() {
		assertEquals("973-386-9420", customers.get(1199).getPhone());
	}

	@Test
	@DisplayName("Record 1200: Fax is 973-386-7896")
	void FaxOfRecord1200() {
		assertEquals("973-386-7896", customers.get(1199).getFax());
	}

	@Test
	@DisplayName("Record 1200: Email is joel@galam.com")
	void EmailOfRecord1200() {
		assertEquals("joel@galam.com", customers.get(1199).getEmail());
	}

	@Test
	@DisplayName("Record 1200: Web is http://www.joelgalam.com")
	void WebOfRecord1200() {
		assertEquals("http://www.joelgalam.com", customers.get(1199).getWeb());
	}
}
