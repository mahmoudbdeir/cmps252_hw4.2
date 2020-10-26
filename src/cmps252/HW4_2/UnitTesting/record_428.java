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

@Tag("36")
class Record_428 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 428: FirstName is Adolfo")
	void FirstNameOfRecord428() {
		assertEquals("Adolfo", customers.get(427).getFirstName());
	}

	@Test
	@DisplayName("Record 428: LastName is Calise")
	void LastNameOfRecord428() {
		assertEquals("Calise", customers.get(427).getLastName());
	}

	@Test
	@DisplayName("Record 428: Company is Narcotics Intrntl Enfcmnt Ofcr")
	void CompanyOfRecord428() {
		assertEquals("Narcotics Intrntl Enfcmnt Ofcr", customers.get(427).getCompany());
	}

	@Test
	@DisplayName("Record 428: Address is 2365 Main St")
	void AddressOfRecord428() {
		assertEquals("2365 Main St", customers.get(427).getAddress());
	}

	@Test
	@DisplayName("Record 428: City is Bridgeport")
	void CityOfRecord428() {
		assertEquals("Bridgeport", customers.get(427).getCity());
	}

	@Test
	@DisplayName("Record 428: County is Fairfield")
	void CountyOfRecord428() {
		assertEquals("Fairfield", customers.get(427).getCounty());
	}

	@Test
	@DisplayName("Record 428: State is CT")
	void StateOfRecord428() {
		assertEquals("CT", customers.get(427).getState());
	}

	@Test
	@DisplayName("Record 428: ZIP is 6606")
	void ZIPOfRecord428() {
		assertEquals("6606", customers.get(427).getZIP());
	}

	@Test
	@DisplayName("Record 428: Phone is 203-334-7737")
	void PhoneOfRecord428() {
		assertEquals("203-334-7737", customers.get(427).getPhone());
	}

	@Test
	@DisplayName("Record 428: Fax is 203-334-9114")
	void FaxOfRecord428() {
		assertEquals("203-334-9114", customers.get(427).getFax());
	}

	@Test
	@DisplayName("Record 428: Email is adolfo@calise.com")
	void EmailOfRecord428() {
		assertEquals("adolfo@calise.com", customers.get(427).getEmail());
	}

	@Test
	@DisplayName("Record 428: Web is http://www.adolfocalise.com")
	void WebOfRecord428() {
		assertEquals("http://www.adolfocalise.com", customers.get(427).getWeb());
	}
}
