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

@Tag("10")
class Record_883 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 883: FirstName is Maria")
	void FirstNameOfRecord883() {
		assertEquals("Maria", customers.get(882).getFirstName());
	}

	@Test
	@DisplayName("Record 883: LastName is Jacques")
	void LastNameOfRecord883() {
		assertEquals("Jacques", customers.get(882).getLastName());
	}

	@Test
	@DisplayName("Record 883: Company is Econo Lodge")
	void CompanyOfRecord883() {
		assertEquals("Econo Lodge", customers.get(882).getCompany());
	}

	@Test
	@DisplayName("Record 883: Address is 50 Washington St")
	void AddressOfRecord883() {
		assertEquals("50 Washington St", customers.get(882).getAddress());
	}

	@Test
	@DisplayName("Record 883: City is Norwalk")
	void CityOfRecord883() {
		assertEquals("Norwalk", customers.get(882).getCity());
	}

	@Test
	@DisplayName("Record 883: County is Fairfield")
	void CountyOfRecord883() {
		assertEquals("Fairfield", customers.get(882).getCounty());
	}

	@Test
	@DisplayName("Record 883: State is CT")
	void StateOfRecord883() {
		assertEquals("CT", customers.get(882).getState());
	}

	@Test
	@DisplayName("Record 883: ZIP is 6854")
	void ZIPOfRecord883() {
		assertEquals("6854", customers.get(882).getZIP());
	}

	@Test
	@DisplayName("Record 883: Phone is 203-351-0522")
	void PhoneOfRecord883() {
		assertEquals("203-351-0522", customers.get(882).getPhone());
	}

	@Test
	@DisplayName("Record 883: Fax is 203-351-6428")
	void FaxOfRecord883() {
		assertEquals("203-351-6428", customers.get(882).getFax());
	}

	@Test
	@DisplayName("Record 883: Email is maria@jacques.com")
	void EmailOfRecord883() {
		assertEquals("maria@jacques.com", customers.get(882).getEmail());
	}

	@Test
	@DisplayName("Record 883: Web is http://www.mariajacques.com")
	void WebOfRecord883() {
		assertEquals("http://www.mariajacques.com", customers.get(882).getWeb());
	}
}
