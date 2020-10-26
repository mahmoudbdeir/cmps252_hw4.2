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

@Tag("2")
class Record_2895 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2895: FirstName is Garry")
	void FirstNameOfRecord2895() {
		assertEquals("Garry", customers.get(2894).getFirstName());
	}

	@Test
	@DisplayName("Record 2895: LastName is Vosper")
	void LastNameOfRecord2895() {
		assertEquals("Vosper", customers.get(2894).getLastName());
	}

	@Test
	@DisplayName("Record 2895: Company is Bethesda Cstm Tailors & Frml")
	void CompanyOfRecord2895() {
		assertEquals("Bethesda Cstm Tailors & Frml", customers.get(2894).getCompany());
	}

	@Test
	@DisplayName("Record 2895: Address is 15107 Moran St")
	void AddressOfRecord2895() {
		assertEquals("15107 Moran St", customers.get(2894).getAddress());
	}

	@Test
	@DisplayName("Record 2895: City is Westminster")
	void CityOfRecord2895() {
		assertEquals("Westminster", customers.get(2894).getCity());
	}

	@Test
	@DisplayName("Record 2895: County is Orange")
	void CountyOfRecord2895() {
		assertEquals("Orange", customers.get(2894).getCounty());
	}

	@Test
	@DisplayName("Record 2895: State is CA")
	void StateOfRecord2895() {
		assertEquals("CA", customers.get(2894).getState());
	}

	@Test
	@DisplayName("Record 2895: ZIP is 92683")
	void ZIPOfRecord2895() {
		assertEquals("92683", customers.get(2894).getZIP());
	}

	@Test
	@DisplayName("Record 2895: Phone is 714-894-0537")
	void PhoneOfRecord2895() {
		assertEquals("714-894-0537", customers.get(2894).getPhone());
	}

	@Test
	@DisplayName("Record 2895: Fax is 714-894-9208")
	void FaxOfRecord2895() {
		assertEquals("714-894-9208", customers.get(2894).getFax());
	}

	@Test
	@DisplayName("Record 2895: Email is garry@vosper.com")
	void EmailOfRecord2895() {
		assertEquals("garry@vosper.com", customers.get(2894).getEmail());
	}

	@Test
	@DisplayName("Record 2895: Web is http://www.garryvosper.com")
	void WebOfRecord2895() {
		assertEquals("http://www.garryvosper.com", customers.get(2894).getWeb());
	}
}
