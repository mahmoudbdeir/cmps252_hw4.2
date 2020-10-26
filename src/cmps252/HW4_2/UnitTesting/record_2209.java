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

@Tag("1")
class Record_2209 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2209: FirstName is Renae")
	void FirstNameOfRecord2209() {
		assertEquals("Renae", customers.get(2208).getFirstName());
	}

	@Test
	@DisplayName("Record 2209: LastName is Edgley")
	void LastNameOfRecord2209() {
		assertEquals("Edgley", customers.get(2208).getLastName());
	}

	@Test
	@DisplayName("Record 2209: Company is Bond, Katherine F Esq")
	void CompanyOfRecord2209() {
		assertEquals("Bond, Katherine F Esq", customers.get(2208).getCompany());
	}

	@Test
	@DisplayName("Record 2209: Address is 2047 Victory Blvd")
	void AddressOfRecord2209() {
		assertEquals("2047 Victory Blvd", customers.get(2208).getAddress());
	}

	@Test
	@DisplayName("Record 2209: City is Staten Island")
	void CityOfRecord2209() {
		assertEquals("Staten Island", customers.get(2208).getCity());
	}

	@Test
	@DisplayName("Record 2209: County is Richmond")
	void CountyOfRecord2209() {
		assertEquals("Richmond", customers.get(2208).getCounty());
	}

	@Test
	@DisplayName("Record 2209: State is NY")
	void StateOfRecord2209() {
		assertEquals("NY", customers.get(2208).getState());
	}

	@Test
	@DisplayName("Record 2209: ZIP is 10314")
	void ZIPOfRecord2209() {
		assertEquals("10314", customers.get(2208).getZIP());
	}

	@Test
	@DisplayName("Record 2209: Phone is 718-494-0480")
	void PhoneOfRecord2209() {
		assertEquals("718-494-0480", customers.get(2208).getPhone());
	}

	@Test
	@DisplayName("Record 2209: Fax is 718-494-4884")
	void FaxOfRecord2209() {
		assertEquals("718-494-4884", customers.get(2208).getFax());
	}

	@Test
	@DisplayName("Record 2209: Email is renae@edgley.com")
	void EmailOfRecord2209() {
		assertEquals("renae@edgley.com", customers.get(2208).getEmail());
	}

	@Test
	@DisplayName("Record 2209: Web is http://www.renaeedgley.com")
	void WebOfRecord2209() {
		assertEquals("http://www.renaeedgley.com", customers.get(2208).getWeb());
	}
}
