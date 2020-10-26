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

@Tag("36")
class Record_4969 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4969: FirstName is Elmer")
	void FirstNameOfRecord4969() {
		assertEquals("Elmer", customers.get(4968).getFirstName());
	}

	@Test
	@DisplayName("Record 4969: LastName is Compton")
	void LastNameOfRecord4969() {
		assertEquals("Compton", customers.get(4968).getLastName());
	}

	@Test
	@DisplayName("Record 4969: Company is Beta Sigma Psi")
	void CompanyOfRecord4969() {
		assertEquals("Beta Sigma Psi", customers.get(4968).getCompany());
	}

	@Test
	@DisplayName("Record 4969: Address is 210 Baronne St  #-920")
	void AddressOfRecord4969() {
		assertEquals("210 Baronne St  #-920", customers.get(4968).getAddress());
	}

	@Test
	@DisplayName("Record 4969: City is New Orleans")
	void CityOfRecord4969() {
		assertEquals("New Orleans", customers.get(4968).getCity());
	}

	@Test
	@DisplayName("Record 4969: County is Orleans")
	void CountyOfRecord4969() {
		assertEquals("Orleans", customers.get(4968).getCounty());
	}

	@Test
	@DisplayName("Record 4969: State is LA")
	void StateOfRecord4969() {
		assertEquals("LA", customers.get(4968).getState());
	}

	@Test
	@DisplayName("Record 4969: ZIP is 70112")
	void ZIPOfRecord4969() {
		assertEquals("70112", customers.get(4968).getZIP());
	}

	@Test
	@DisplayName("Record 4969: Phone is 504-568-7784")
	void PhoneOfRecord4969() {
		assertEquals("504-568-7784", customers.get(4968).getPhone());
	}

	@Test
	@DisplayName("Record 4969: Fax is 504-568-0882")
	void FaxOfRecord4969() {
		assertEquals("504-568-0882", customers.get(4968).getFax());
	}

	@Test
	@DisplayName("Record 4969: Email is elmer@compton.com")
	void EmailOfRecord4969() {
		assertEquals("elmer@compton.com", customers.get(4968).getEmail());
	}

	@Test
	@DisplayName("Record 4969: Web is http://www.elmercompton.com")
	void WebOfRecord4969() {
		assertEquals("http://www.elmercompton.com", customers.get(4968).getWeb());
	}
}
