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

@Tag("31")
class Record_4968 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4968: FirstName is Shanda")
	void FirstNameOfRecord4968() {
		assertEquals("Shanda", customers.get(4967).getFirstName());
	}

	@Test
	@DisplayName("Record 4968: LastName is Matero")
	void LastNameOfRecord4968() {
		assertEquals("Matero", customers.get(4967).getLastName());
	}

	@Test
	@DisplayName("Record 4968: Company is Bollinger, Nancy G Esq")
	void CompanyOfRecord4968() {
		assertEquals("Bollinger, Nancy G Esq", customers.get(4967).getCompany());
	}

	@Test
	@DisplayName("Record 4968: Address is 2925 Post Rd")
	void AddressOfRecord4968() {
		assertEquals("2925 Post Rd", customers.get(4967).getAddress());
	}

	@Test
	@DisplayName("Record 4968: City is Stevens Point")
	void CityOfRecord4968() {
		assertEquals("Stevens Point", customers.get(4967).getCity());
	}

	@Test
	@DisplayName("Record 4968: County is Portage")
	void CountyOfRecord4968() {
		assertEquals("Portage", customers.get(4967).getCounty());
	}

	@Test
	@DisplayName("Record 4968: State is WI")
	void StateOfRecord4968() {
		assertEquals("WI", customers.get(4967).getState());
	}

	@Test
	@DisplayName("Record 4968: ZIP is 54481")
	void ZIPOfRecord4968() {
		assertEquals("54481", customers.get(4967).getZIP());
	}

	@Test
	@DisplayName("Record 4968: Phone is 715-341-4990")
	void PhoneOfRecord4968() {
		assertEquals("715-341-4990", customers.get(4967).getPhone());
	}

	@Test
	@DisplayName("Record 4968: Fax is 715-341-4423")
	void FaxOfRecord4968() {
		assertEquals("715-341-4423", customers.get(4967).getFax());
	}

	@Test
	@DisplayName("Record 4968: Email is shanda@matero.com")
	void EmailOfRecord4968() {
		assertEquals("shanda@matero.com", customers.get(4967).getEmail());
	}

	@Test
	@DisplayName("Record 4968: Web is http://www.shandamatero.com")
	void WebOfRecord4968() {
		assertEquals("http://www.shandamatero.com", customers.get(4967).getWeb());
	}
}
