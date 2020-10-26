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

@Tag("41")
class Record_2985 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2985: FirstName is Jeannette")
	void FirstNameOfRecord2985() {
		assertEquals("Jeannette", customers.get(2984).getFirstName());
	}

	@Test
	@DisplayName("Record 2985: LastName is Mieszala")
	void LastNameOfRecord2985() {
		assertEquals("Mieszala", customers.get(2984).getLastName());
	}

	@Test
	@DisplayName("Record 2985: Company is Wyatt, Groves Decker Esq")
	void CompanyOfRecord2985() {
		assertEquals("Wyatt, Groves Decker Esq", customers.get(2984).getCompany());
	}

	@Test
	@DisplayName("Record 2985: Address is 844 Centre Ave")
	void AddressOfRecord2985() {
		assertEquals("844 Centre Ave", customers.get(2984).getAddress());
	}

	@Test
	@DisplayName("Record 2985: City is Reading")
	void CityOfRecord2985() {
		assertEquals("Reading", customers.get(2984).getCity());
	}

	@Test
	@DisplayName("Record 2985: County is Berks")
	void CountyOfRecord2985() {
		assertEquals("Berks", customers.get(2984).getCounty());
	}

	@Test
	@DisplayName("Record 2985: State is PA")
	void StateOfRecord2985() {
		assertEquals("PA", customers.get(2984).getState());
	}

	@Test
	@DisplayName("Record 2985: ZIP is 19601")
	void ZIPOfRecord2985() {
		assertEquals("19601", customers.get(2984).getZIP());
	}

	@Test
	@DisplayName("Record 2985: Phone is 610-378-7900")
	void PhoneOfRecord2985() {
		assertEquals("610-378-7900", customers.get(2984).getPhone());
	}

	@Test
	@DisplayName("Record 2985: Fax is 610-378-6843")
	void FaxOfRecord2985() {
		assertEquals("610-378-6843", customers.get(2984).getFax());
	}

	@Test
	@DisplayName("Record 2985: Email is jeannette@mieszala.com")
	void EmailOfRecord2985() {
		assertEquals("jeannette@mieszala.com", customers.get(2984).getEmail());
	}

	@Test
	@DisplayName("Record 2985: Web is http://www.jeannettemieszala.com")
	void WebOfRecord2985() {
		assertEquals("http://www.jeannettemieszala.com", customers.get(2984).getWeb());
	}
}
