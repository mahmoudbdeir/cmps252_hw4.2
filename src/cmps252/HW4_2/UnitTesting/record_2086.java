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

@Tag("17")
class Record_2086 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2086: FirstName is Edythe")
	void FirstNameOfRecord2086() {
		assertEquals("Edythe", customers.get(2085).getFirstName());
	}

	@Test
	@DisplayName("Record 2086: LastName is Giuffrida")
	void LastNameOfRecord2086() {
		assertEquals("Giuffrida", customers.get(2085).getLastName());
	}

	@Test
	@DisplayName("Record 2086: Company is Electronic Super Store")
	void CompanyOfRecord2086() {
		assertEquals("Electronic Super Store", customers.get(2085).getCompany());
	}

	@Test
	@DisplayName("Record 2086: Address is 36 E 4th St  #-1320")
	void AddressOfRecord2086() {
		assertEquals("36 E 4th St  #-1320", customers.get(2085).getAddress());
	}

	@Test
	@DisplayName("Record 2086: City is Cincinnati")
	void CityOfRecord2086() {
		assertEquals("Cincinnati", customers.get(2085).getCity());
	}

	@Test
	@DisplayName("Record 2086: County is Hamilton")
	void CountyOfRecord2086() {
		assertEquals("Hamilton", customers.get(2085).getCounty());
	}

	@Test
	@DisplayName("Record 2086: State is OH")
	void StateOfRecord2086() {
		assertEquals("OH", customers.get(2085).getState());
	}

	@Test
	@DisplayName("Record 2086: ZIP is 45202")
	void ZIPOfRecord2086() {
		assertEquals("45202", customers.get(2085).getZIP());
	}

	@Test
	@DisplayName("Record 2086: Phone is 513-241-8314")
	void PhoneOfRecord2086() {
		assertEquals("513-241-8314", customers.get(2085).getPhone());
	}

	@Test
	@DisplayName("Record 2086: Fax is 513-241-3279")
	void FaxOfRecord2086() {
		assertEquals("513-241-3279", customers.get(2085).getFax());
	}

	@Test
	@DisplayName("Record 2086: Email is edythe@giuffrida.com")
	void EmailOfRecord2086() {
		assertEquals("edythe@giuffrida.com", customers.get(2085).getEmail());
	}

	@Test
	@DisplayName("Record 2086: Web is http://www.edythegiuffrida.com")
	void WebOfRecord2086() {
		assertEquals("http://www.edythegiuffrida.com", customers.get(2085).getWeb());
	}
}
