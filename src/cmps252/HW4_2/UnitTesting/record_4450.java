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

@Tag("45")
class Record_4450 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4450: FirstName is Arlene")
	void FirstNameOfRecord4450() {
		assertEquals("Arlene", customers.get(4449).getFirstName());
	}

	@Test
	@DisplayName("Record 4450: LastName is Slingluff")
	void LastNameOfRecord4450() {
		assertEquals("Slingluff", customers.get(4449).getLastName());
	}

	@Test
	@DisplayName("Record 4450: Company is Mcluskie, Rick L Cpa")
	void CompanyOfRecord4450() {
		assertEquals("Mcluskie, Rick L Cpa", customers.get(4449).getCompany());
	}

	@Test
	@DisplayName("Record 4450: Address is 1647 Jet Wing Dr")
	void AddressOfRecord4450() {
		assertEquals("1647 Jet Wing Dr", customers.get(4449).getAddress());
	}

	@Test
	@DisplayName("Record 4450: City is Colorado Springs")
	void CityOfRecord4450() {
		assertEquals("Colorado Springs", customers.get(4449).getCity());
	}

	@Test
	@DisplayName("Record 4450: County is El Paso")
	void CountyOfRecord4450() {
		assertEquals("El Paso", customers.get(4449).getCounty());
	}

	@Test
	@DisplayName("Record 4450: State is CO")
	void StateOfRecord4450() {
		assertEquals("CO", customers.get(4449).getState());
	}

	@Test
	@DisplayName("Record 4450: ZIP is 80916")
	void ZIPOfRecord4450() {
		assertEquals("80916", customers.get(4449).getZIP());
	}

	@Test
	@DisplayName("Record 4450: Phone is 719-574-5502")
	void PhoneOfRecord4450() {
		assertEquals("719-574-5502", customers.get(4449).getPhone());
	}

	@Test
	@DisplayName("Record 4450: Fax is 719-574-0934")
	void FaxOfRecord4450() {
		assertEquals("719-574-0934", customers.get(4449).getFax());
	}

	@Test
	@DisplayName("Record 4450: Email is arlene@slingluff.com")
	void EmailOfRecord4450() {
		assertEquals("arlene@slingluff.com", customers.get(4449).getEmail());
	}

	@Test
	@DisplayName("Record 4450: Web is http://www.arleneslingluff.com")
	void WebOfRecord4450() {
		assertEquals("http://www.arleneslingluff.com", customers.get(4449).getWeb());
	}
}
