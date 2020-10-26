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

@Tag("5")
class Record_2085 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2085: FirstName is Lamont")
	void FirstNameOfRecord2085() {
		assertEquals("Lamont", customers.get(2084).getFirstName());
	}

	@Test
	@DisplayName("Record 2085: LastName is Gerbs")
	void LastNameOfRecord2085() {
		assertEquals("Gerbs", customers.get(2084).getLastName());
	}

	@Test
	@DisplayName("Record 2085: Company is Lake Of The Woods Resort")
	void CompanyOfRecord2085() {
		assertEquals("Lake Of The Woods Resort", customers.get(2084).getCompany());
	}

	@Test
	@DisplayName("Record 2085: Address is 101 Main St")
	void AddressOfRecord2085() {
		assertEquals("101 Main St", customers.get(2084).getAddress());
	}

	@Test
	@DisplayName("Record 2085: City is Burlington")
	void CityOfRecord2085() {
		assertEquals("Burlington", customers.get(2084).getCity());
	}

	@Test
	@DisplayName("Record 2085: County is Chittenden")
	void CountyOfRecord2085() {
		assertEquals("Chittenden", customers.get(2084).getCounty());
	}

	@Test
	@DisplayName("Record 2085: State is VT")
	void StateOfRecord2085() {
		assertEquals("VT", customers.get(2084).getState());
	}

	@Test
	@DisplayName("Record 2085: ZIP is 5401")
	void ZIPOfRecord2085() {
		assertEquals("5401", customers.get(2084).getZIP());
	}

	@Test
	@DisplayName("Record 2085: Phone is 802-658-7685")
	void PhoneOfRecord2085() {
		assertEquals("802-658-7685", customers.get(2084).getPhone());
	}

	@Test
	@DisplayName("Record 2085: Fax is 802-658-7721")
	void FaxOfRecord2085() {
		assertEquals("802-658-7721", customers.get(2084).getFax());
	}

	@Test
	@DisplayName("Record 2085: Email is lamont@gerbs.com")
	void EmailOfRecord2085() {
		assertEquals("lamont@gerbs.com", customers.get(2084).getEmail());
	}

	@Test
	@DisplayName("Record 2085: Web is http://www.lamontgerbs.com")
	void WebOfRecord2085() {
		assertEquals("http://www.lamontgerbs.com", customers.get(2084).getWeb());
	}
}
