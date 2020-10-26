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

@Tag("11")
class Record_1068 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1068: FirstName is Stacie")
	void FirstNameOfRecord1068() {
		assertEquals("Stacie", customers.get(1067).getFirstName());
	}

	@Test
	@DisplayName("Record 1068: LastName is Bayhonan")
	void LastNameOfRecord1068() {
		assertEquals("Bayhonan", customers.get(1067).getLastName());
	}

	@Test
	@DisplayName("Record 1068: Company is Groezinger Provision Inc")
	void CompanyOfRecord1068() {
		assertEquals("Groezinger Provision Inc", customers.get(1067).getCompany());
	}

	@Test
	@DisplayName("Record 1068: Address is 1837 Monterey Hwy")
	void AddressOfRecord1068() {
		assertEquals("1837 Monterey Hwy", customers.get(1067).getAddress());
	}

	@Test
	@DisplayName("Record 1068: City is San Jose")
	void CityOfRecord1068() {
		assertEquals("San Jose", customers.get(1067).getCity());
	}

	@Test
	@DisplayName("Record 1068: County is Santa Clara")
	void CountyOfRecord1068() {
		assertEquals("Santa Clara", customers.get(1067).getCounty());
	}

	@Test
	@DisplayName("Record 1068: State is CA")
	void StateOfRecord1068() {
		assertEquals("CA", customers.get(1067).getState());
	}

	@Test
	@DisplayName("Record 1068: ZIP is 95112")
	void ZIPOfRecord1068() {
		assertEquals("95112", customers.get(1067).getZIP());
	}

	@Test
	@DisplayName("Record 1068: Phone is 408-294-2398")
	void PhoneOfRecord1068() {
		assertEquals("408-294-2398", customers.get(1067).getPhone());
	}

	@Test
	@DisplayName("Record 1068: Fax is 408-294-3095")
	void FaxOfRecord1068() {
		assertEquals("408-294-3095", customers.get(1067).getFax());
	}

	@Test
	@DisplayName("Record 1068: Email is stacie@bayhonan.com")
	void EmailOfRecord1068() {
		assertEquals("stacie@bayhonan.com", customers.get(1067).getEmail());
	}

	@Test
	@DisplayName("Record 1068: Web is http://www.staciebayhonan.com")
	void WebOfRecord1068() {
		assertEquals("http://www.staciebayhonan.com", customers.get(1067).getWeb());
	}
}
