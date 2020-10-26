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

@Tag("27")
class Record_4753 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4753: FirstName is Lynda")
	void FirstNameOfRecord4753() {
		assertEquals("Lynda", customers.get(4752).getFirstName());
	}

	@Test
	@DisplayName("Record 4753: LastName is Algire")
	void LastNameOfRecord4753() {
		assertEquals("Algire", customers.get(4752).getLastName());
	}

	@Test
	@DisplayName("Record 4753: Company is Sits, Timothy L Esq")
	void CompanyOfRecord4753() {
		assertEquals("Sits, Timothy L Esq", customers.get(4752).getCompany());
	}

	@Test
	@DisplayName("Record 4753: Address is 177 Anclote Rd")
	void AddressOfRecord4753() {
		assertEquals("177 Anclote Rd", customers.get(4752).getAddress());
	}

	@Test
	@DisplayName("Record 4753: City is Tarpon Springs")
	void CityOfRecord4753() {
		assertEquals("Tarpon Springs", customers.get(4752).getCity());
	}

	@Test
	@DisplayName("Record 4753: County is Pinellas")
	void CountyOfRecord4753() {
		assertEquals("Pinellas", customers.get(4752).getCounty());
	}

	@Test
	@DisplayName("Record 4753: State is FL")
	void StateOfRecord4753() {
		assertEquals("FL", customers.get(4752).getState());
	}

	@Test
	@DisplayName("Record 4753: ZIP is 34689")
	void ZIPOfRecord4753() {
		assertEquals("34689", customers.get(4752).getZIP());
	}

	@Test
	@DisplayName("Record 4753: Phone is 727-942-3892")
	void PhoneOfRecord4753() {
		assertEquals("727-942-3892", customers.get(4752).getPhone());
	}

	@Test
	@DisplayName("Record 4753: Fax is 727-942-4797")
	void FaxOfRecord4753() {
		assertEquals("727-942-4797", customers.get(4752).getFax());
	}

	@Test
	@DisplayName("Record 4753: Email is lynda@algire.com")
	void EmailOfRecord4753() {
		assertEquals("lynda@algire.com", customers.get(4752).getEmail());
	}

	@Test
	@DisplayName("Record 4753: Web is http://www.lyndaalgire.com")
	void WebOfRecord4753() {
		assertEquals("http://www.lyndaalgire.com", customers.get(4752).getWeb());
	}
}
