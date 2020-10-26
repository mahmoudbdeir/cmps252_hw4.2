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
class Record_4390 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4390: FirstName is Julius")
	void FirstNameOfRecord4390() {
		assertEquals("Julius", customers.get(4389).getFirstName());
	}

	@Test
	@DisplayName("Record 4390: LastName is Krivanec")
	void LastNameOfRecord4390() {
		assertEquals("Krivanec", customers.get(4389).getLastName());
	}

	@Test
	@DisplayName("Record 4390: Company is Star Beauty Supply")
	void CompanyOfRecord4390() {
		assertEquals("Star Beauty Supply", customers.get(4389).getCompany());
	}

	@Test
	@DisplayName("Record 4390: Address is 14920 S Main St")
	void AddressOfRecord4390() {
		assertEquals("14920 S Main St", customers.get(4389).getAddress());
	}

	@Test
	@DisplayName("Record 4390: City is Gardena")
	void CityOfRecord4390() {
		assertEquals("Gardena", customers.get(4389).getCity());
	}

	@Test
	@DisplayName("Record 4390: County is Los Angeles")
	void CountyOfRecord4390() {
		assertEquals("Los Angeles", customers.get(4389).getCounty());
	}

	@Test
	@DisplayName("Record 4390: State is CA")
	void StateOfRecord4390() {
		assertEquals("CA", customers.get(4389).getState());
	}

	@Test
	@DisplayName("Record 4390: ZIP is 90248")
	void ZIPOfRecord4390() {
		assertEquals("90248", customers.get(4389).getZIP());
	}

	@Test
	@DisplayName("Record 4390: Phone is 310-323-5609")
	void PhoneOfRecord4390() {
		assertEquals("310-323-5609", customers.get(4389).getPhone());
	}

	@Test
	@DisplayName("Record 4390: Fax is 310-323-8872")
	void FaxOfRecord4390() {
		assertEquals("310-323-8872", customers.get(4389).getFax());
	}

	@Test
	@DisplayName("Record 4390: Email is julius@krivanec.com")
	void EmailOfRecord4390() {
		assertEquals("julius@krivanec.com", customers.get(4389).getEmail());
	}

	@Test
	@DisplayName("Record 4390: Web is http://www.juliuskrivanec.com")
	void WebOfRecord4390() {
		assertEquals("http://www.juliuskrivanec.com", customers.get(4389).getWeb());
	}
}
