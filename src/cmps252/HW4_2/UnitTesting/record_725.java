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

@Tag("32")
class Record_725 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 725: FirstName is Genevieve")
	void FirstNameOfRecord725() {
		assertEquals("Genevieve", customers.get(724).getFirstName());
	}

	@Test
	@DisplayName("Record 725: LastName is Hayashi")
	void LastNameOfRecord725() {
		assertEquals("Hayashi", customers.get(724).getLastName());
	}

	@Test
	@DisplayName("Record 725: Company is Kpmg Peat Marwick")
	void CompanyOfRecord725() {
		assertEquals("Kpmg Peat Marwick", customers.get(724).getCompany());
	}

	@Test
	@DisplayName("Record 725: Address is 4933 Mason St")
	void AddressOfRecord725() {
		assertEquals("4933 Mason St", customers.get(724).getAddress());
	}

	@Test
	@DisplayName("Record 725: City is South Gate")
	void CityOfRecord725() {
		assertEquals("South Gate", customers.get(724).getCity());
	}

	@Test
	@DisplayName("Record 725: County is Los Angeles")
	void CountyOfRecord725() {
		assertEquals("Los Angeles", customers.get(724).getCounty());
	}

	@Test
	@DisplayName("Record 725: State is CA")
	void StateOfRecord725() {
		assertEquals("CA", customers.get(724).getState());
	}

	@Test
	@DisplayName("Record 725: ZIP is 90280")
	void ZIPOfRecord725() {
		assertEquals("90280", customers.get(724).getZIP());
	}

	@Test
	@DisplayName("Record 725: Phone is 323-564-3439")
	void PhoneOfRecord725() {
		assertEquals("323-564-3439", customers.get(724).getPhone());
	}

	@Test
	@DisplayName("Record 725: Fax is 323-564-4354")
	void FaxOfRecord725() {
		assertEquals("323-564-4354", customers.get(724).getFax());
	}

	@Test
	@DisplayName("Record 725: Email is genevieve@hayashi.com")
	void EmailOfRecord725() {
		assertEquals("genevieve@hayashi.com", customers.get(724).getEmail());
	}

	@Test
	@DisplayName("Record 725: Web is http://www.genevievehayashi.com")
	void WebOfRecord725() {
		assertEquals("http://www.genevievehayashi.com", customers.get(724).getWeb());
	}
}
