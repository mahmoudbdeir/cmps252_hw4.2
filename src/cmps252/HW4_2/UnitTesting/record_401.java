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

@Tag("9")
class Record_401 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 401: FirstName is Luisa")
	void FirstNameOfRecord401() {
		assertEquals("Luisa", customers.get(400).getFirstName());
	}

	@Test
	@DisplayName("Record 401: LastName is Decoux")
	void LastNameOfRecord401() {
		assertEquals("Decoux", customers.get(400).getLastName());
	}

	@Test
	@DisplayName("Record 401: Company is Gte Telephone Oper Mdwst Regn")
	void CompanyOfRecord401() {
		assertEquals("Gte Telephone Oper Mdwst Regn", customers.get(400).getCompany());
	}

	@Test
	@DisplayName("Record 401: Address is 26 Broadway")
	void AddressOfRecord401() {
		assertEquals("26 Broadway", customers.get(400).getAddress());
	}

	@Test
	@DisplayName("Record 401: City is Denville")
	void CityOfRecord401() {
		assertEquals("Denville", customers.get(400).getCity());
	}

	@Test
	@DisplayName("Record 401: County is Morris")
	void CountyOfRecord401() {
		assertEquals("Morris", customers.get(400).getCounty());
	}

	@Test
	@DisplayName("Record 401: State is NJ")
	void StateOfRecord401() {
		assertEquals("NJ", customers.get(400).getState());
	}

	@Test
	@DisplayName("Record 401: ZIP is 7834")
	void ZIPOfRecord401() {
		assertEquals("7834", customers.get(400).getZIP());
	}

	@Test
	@DisplayName("Record 401: Phone is 973-625-1533")
	void PhoneOfRecord401() {
		assertEquals("973-625-1533", customers.get(400).getPhone());
	}

	@Test
	@DisplayName("Record 401: Fax is 973-625-4001")
	void FaxOfRecord401() {
		assertEquals("973-625-4001", customers.get(400).getFax());
	}

	@Test
	@DisplayName("Record 401: Email is luisa@decoux.com")
	void EmailOfRecord401() {
		assertEquals("luisa@decoux.com", customers.get(400).getEmail());
	}

	@Test
	@DisplayName("Record 401: Web is http://www.luisadecoux.com")
	void WebOfRecord401() {
		assertEquals("http://www.luisadecoux.com", customers.get(400).getWeb());
	}
}
