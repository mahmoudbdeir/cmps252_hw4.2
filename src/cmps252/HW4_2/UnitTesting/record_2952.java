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

@Tag("7")
class Record_2952 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2952: FirstName is Spencer")
	void FirstNameOfRecord2952() {
		assertEquals("Spencer", customers.get(2951).getFirstName());
	}

	@Test
	@DisplayName("Record 2952: LastName is Mennie")
	void LastNameOfRecord2952() {
		assertEquals("Mennie", customers.get(2951).getLastName());
	}

	@Test
	@DisplayName("Record 2952: Company is Computer Sec Plcmt Svc Inc")
	void CompanyOfRecord2952() {
		assertEquals("Computer Sec Plcmt Svc Inc", customers.get(2951).getCompany());
	}

	@Test
	@DisplayName("Record 2952: Address is 2024 Macklind Ave")
	void AddressOfRecord2952() {
		assertEquals("2024 Macklind Ave", customers.get(2951).getAddress());
	}

	@Test
	@DisplayName("Record 2952: City is Saint Louis")
	void CityOfRecord2952() {
		assertEquals("Saint Louis", customers.get(2951).getCity());
	}

	@Test
	@DisplayName("Record 2952: County is Saint Louis City")
	void CountyOfRecord2952() {
		assertEquals("Saint Louis City", customers.get(2951).getCounty());
	}

	@Test
	@DisplayName("Record 2952: State is MO")
	void StateOfRecord2952() {
		assertEquals("MO", customers.get(2951).getState());
	}

	@Test
	@DisplayName("Record 2952: ZIP is 63110")
	void ZIPOfRecord2952() {
		assertEquals("63110", customers.get(2951).getZIP());
	}

	@Test
	@DisplayName("Record 2952: Phone is 314-771-7331")
	void PhoneOfRecord2952() {
		assertEquals("314-771-7331", customers.get(2951).getPhone());
	}

	@Test
	@DisplayName("Record 2952: Fax is 314-771-2114")
	void FaxOfRecord2952() {
		assertEquals("314-771-2114", customers.get(2951).getFax());
	}

	@Test
	@DisplayName("Record 2952: Email is spencer@mennie.com")
	void EmailOfRecord2952() {
		assertEquals("spencer@mennie.com", customers.get(2951).getEmail());
	}

	@Test
	@DisplayName("Record 2952: Web is http://www.spencermennie.com")
	void WebOfRecord2952() {
		assertEquals("http://www.spencermennie.com", customers.get(2951).getWeb());
	}
}
