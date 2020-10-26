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
class Record_4953 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4953: FirstName is Araceli")
	void FirstNameOfRecord4953() {
		assertEquals("Araceli", customers.get(4952).getFirstName());
	}

	@Test
	@DisplayName("Record 4953: LastName is Vansumeren")
	void LastNameOfRecord4953() {
		assertEquals("Vansumeren", customers.get(4952).getLastName());
	}

	@Test
	@DisplayName("Record 4953: Company is Wenzel Engineering Inc")
	void CompanyOfRecord4953() {
		assertEquals("Wenzel Engineering Inc", customers.get(4952).getCompany());
	}

	@Test
	@DisplayName("Record 4953: Address is 1308 Washington St")
	void AddressOfRecord4953() {
		assertEquals("1308 Washington St", customers.get(4952).getAddress());
	}

	@Test
	@DisplayName("Record 4953: City is Manitowoc")
	void CityOfRecord4953() {
		assertEquals("Manitowoc", customers.get(4952).getCity());
	}

	@Test
	@DisplayName("Record 4953: County is Manitowoc")
	void CountyOfRecord4953() {
		assertEquals("Manitowoc", customers.get(4952).getCounty());
	}

	@Test
	@DisplayName("Record 4953: State is WI")
	void StateOfRecord4953() {
		assertEquals("WI", customers.get(4952).getState());
	}

	@Test
	@DisplayName("Record 4953: ZIP is 54220")
	void ZIPOfRecord4953() {
		assertEquals("54220", customers.get(4952).getZIP());
	}

	@Test
	@DisplayName("Record 4953: Phone is 920-682-5201")
	void PhoneOfRecord4953() {
		assertEquals("920-682-5201", customers.get(4952).getPhone());
	}

	@Test
	@DisplayName("Record 4953: Fax is 920-682-6389")
	void FaxOfRecord4953() {
		assertEquals("920-682-6389", customers.get(4952).getFax());
	}

	@Test
	@DisplayName("Record 4953: Email is araceli@vansumeren.com")
	void EmailOfRecord4953() {
		assertEquals("araceli@vansumeren.com", customers.get(4952).getEmail());
	}

	@Test
	@DisplayName("Record 4953: Web is http://www.aracelivansumeren.com")
	void WebOfRecord4953() {
		assertEquals("http://www.aracelivansumeren.com", customers.get(4952).getWeb());
	}
}
