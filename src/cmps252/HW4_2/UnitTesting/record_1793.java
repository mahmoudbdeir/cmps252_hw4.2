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

@Tag("22")
class Record_1793 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1793: FirstName is Pasquale")
	void FirstNameOfRecord1793() {
		assertEquals("Pasquale", customers.get(1792).getFirstName());
	}

	@Test
	@DisplayName("Record 1793: LastName is Cardimino")
	void LastNameOfRecord1793() {
		assertEquals("Cardimino", customers.get(1792).getLastName());
	}

	@Test
	@DisplayName("Record 1793: Company is Lynn, Donald E Esq")
	void CompanyOfRecord1793() {
		assertEquals("Lynn, Donald E Esq", customers.get(1792).getCompany());
	}

	@Test
	@DisplayName("Record 1793: Address is 4710 N 16th St  #-105")
	void AddressOfRecord1793() {
		assertEquals("4710 N 16th St  #-105", customers.get(1792).getAddress());
	}

	@Test
	@DisplayName("Record 1793: City is Phoenix")
	void CityOfRecord1793() {
		assertEquals("Phoenix", customers.get(1792).getCity());
	}

	@Test
	@DisplayName("Record 1793: County is Maricopa")
	void CountyOfRecord1793() {
		assertEquals("Maricopa", customers.get(1792).getCounty());
	}

	@Test
	@DisplayName("Record 1793: State is AZ")
	void StateOfRecord1793() {
		assertEquals("AZ", customers.get(1792).getState());
	}

	@Test
	@DisplayName("Record 1793: ZIP is 85016")
	void ZIPOfRecord1793() {
		assertEquals("85016", customers.get(1792).getZIP());
	}

	@Test
	@DisplayName("Record 1793: Phone is 602-581-3136")
	void PhoneOfRecord1793() {
		assertEquals("602-581-3136", customers.get(1792).getPhone());
	}

	@Test
	@DisplayName("Record 1793: Fax is 602-581-4472")
	void FaxOfRecord1793() {
		assertEquals("602-581-4472", customers.get(1792).getFax());
	}

	@Test
	@DisplayName("Record 1793: Email is pasquale@cardimino.com")
	void EmailOfRecord1793() {
		assertEquals("pasquale@cardimino.com", customers.get(1792).getEmail());
	}

	@Test
	@DisplayName("Record 1793: Web is http://www.pasqualecardimino.com")
	void WebOfRecord1793() {
		assertEquals("http://www.pasqualecardimino.com", customers.get(1792).getWeb());
	}
}
