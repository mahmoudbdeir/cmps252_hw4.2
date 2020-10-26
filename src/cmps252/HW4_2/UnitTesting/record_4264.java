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

@Tag("7")
class Record_4264 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4264: FirstName is Willian")
	void FirstNameOfRecord4264() {
		assertEquals("Willian", customers.get(4263).getFirstName());
	}

	@Test
	@DisplayName("Record 4264: LastName is Skaflen")
	void LastNameOfRecord4264() {
		assertEquals("Skaflen", customers.get(4263).getLastName());
	}

	@Test
	@DisplayName("Record 4264: Company is Walters, William E Esq")
	void CompanyOfRecord4264() {
		assertEquals("Walters, William E Esq", customers.get(4263).getCompany());
	}

	@Test
	@DisplayName("Record 4264: Address is 1226 Chapline St")
	void AddressOfRecord4264() {
		assertEquals("1226 Chapline St", customers.get(4263).getAddress());
	}

	@Test
	@DisplayName("Record 4264: City is Wheeling")
	void CityOfRecord4264() {
		assertEquals("Wheeling", customers.get(4263).getCity());
	}

	@Test
	@DisplayName("Record 4264: County is Ohio")
	void CountyOfRecord4264() {
		assertEquals("Ohio", customers.get(4263).getCounty());
	}

	@Test
	@DisplayName("Record 4264: State is WV")
	void StateOfRecord4264() {
		assertEquals("WV", customers.get(4263).getState());
	}

	@Test
	@DisplayName("Record 4264: ZIP is 26003")
	void ZIPOfRecord4264() {
		assertEquals("26003", customers.get(4263).getZIP());
	}

	@Test
	@DisplayName("Record 4264: Phone is 304-233-3899")
	void PhoneOfRecord4264() {
		assertEquals("304-233-3899", customers.get(4263).getPhone());
	}

	@Test
	@DisplayName("Record 4264: Fax is 304-233-6448")
	void FaxOfRecord4264() {
		assertEquals("304-233-6448", customers.get(4263).getFax());
	}

	@Test
	@DisplayName("Record 4264: Email is willian@skaflen.com")
	void EmailOfRecord4264() {
		assertEquals("willian@skaflen.com", customers.get(4263).getEmail());
	}

	@Test
	@DisplayName("Record 4264: Web is http://www.willianskaflen.com")
	void WebOfRecord4264() {
		assertEquals("http://www.willianskaflen.com", customers.get(4263).getWeb());
	}
}
