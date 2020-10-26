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

@Tag("32")
class Record_2389 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2389: FirstName is Ricardo")
	void FirstNameOfRecord2389() {
		assertEquals("Ricardo", customers.get(2388).getFirstName());
	}

	@Test
	@DisplayName("Record 2389: LastName is Lish")
	void LastNameOfRecord2389() {
		assertEquals("Lish", customers.get(2388).getLastName());
	}

	@Test
	@DisplayName("Record 2389: Company is David William Engelman Pc")
	void CompanyOfRecord2389() {
		assertEquals("David William Engelman Pc", customers.get(2388).getCompany());
	}

	@Test
	@DisplayName("Record 2389: Address is 647 River St")
	void AddressOfRecord2389() {
		assertEquals("647 River St", customers.get(2388).getAddress());
	}

	@Test
	@DisplayName("Record 2389: City is Paterson")
	void CityOfRecord2389() {
		assertEquals("Paterson", customers.get(2388).getCity());
	}

	@Test
	@DisplayName("Record 2389: County is Passaic")
	void CountyOfRecord2389() {
		assertEquals("Passaic", customers.get(2388).getCounty());
	}

	@Test
	@DisplayName("Record 2389: State is NJ")
	void StateOfRecord2389() {
		assertEquals("NJ", customers.get(2388).getState());
	}

	@Test
	@DisplayName("Record 2389: ZIP is 7524")
	void ZIPOfRecord2389() {
		assertEquals("7524", customers.get(2388).getZIP());
	}

	@Test
	@DisplayName("Record 2389: Phone is 973-345-7788")
	void PhoneOfRecord2389() {
		assertEquals("973-345-7788", customers.get(2388).getPhone());
	}

	@Test
	@DisplayName("Record 2389: Fax is 973-345-9221")
	void FaxOfRecord2389() {
		assertEquals("973-345-9221", customers.get(2388).getFax());
	}

	@Test
	@DisplayName("Record 2389: Email is ricardo@lish.com")
	void EmailOfRecord2389() {
		assertEquals("ricardo@lish.com", customers.get(2388).getEmail());
	}

	@Test
	@DisplayName("Record 2389: Web is http://www.ricardolish.com")
	void WebOfRecord2389() {
		assertEquals("http://www.ricardolish.com", customers.get(2388).getWeb());
	}
}
