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

@Tag("15")
class Record_1425 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1425: FirstName is Sung")
	void FirstNameOfRecord1425() {
		assertEquals("Sung", customers.get(1424).getFirstName());
	}

	@Test
	@DisplayName("Record 1425: LastName is Zamorano")
	void LastNameOfRecord1425() {
		assertEquals("Zamorano", customers.get(1424).getLastName());
	}

	@Test
	@DisplayName("Record 1425: Company is Murray, Michael J Esq")
	void CompanyOfRecord1425() {
		assertEquals("Murray, Michael J Esq", customers.get(1424).getCompany());
	}

	@Test
	@DisplayName("Record 1425: Address is 3614 Old Getwell Rd")
	void AddressOfRecord1425() {
		assertEquals("3614 Old Getwell Rd", customers.get(1424).getAddress());
	}

	@Test
	@DisplayName("Record 1425: City is Memphis")
	void CityOfRecord1425() {
		assertEquals("Memphis", customers.get(1424).getCity());
	}

	@Test
	@DisplayName("Record 1425: County is Shelby")
	void CountyOfRecord1425() {
		assertEquals("Shelby", customers.get(1424).getCounty());
	}

	@Test
	@DisplayName("Record 1425: State is TN")
	void StateOfRecord1425() {
		assertEquals("TN", customers.get(1424).getState());
	}

	@Test
	@DisplayName("Record 1425: ZIP is 38118")
	void ZIPOfRecord1425() {
		assertEquals("38118", customers.get(1424).getZIP());
	}

	@Test
	@DisplayName("Record 1425: Phone is 901-794-8652")
	void PhoneOfRecord1425() {
		assertEquals("901-794-8652", customers.get(1424).getPhone());
	}

	@Test
	@DisplayName("Record 1425: Fax is 901-794-0929")
	void FaxOfRecord1425() {
		assertEquals("901-794-0929", customers.get(1424).getFax());
	}

	@Test
	@DisplayName("Record 1425: Email is sung@zamorano.com")
	void EmailOfRecord1425() {
		assertEquals("sung@zamorano.com", customers.get(1424).getEmail());
	}

	@Test
	@DisplayName("Record 1425: Web is http://www.sungzamorano.com")
	void WebOfRecord1425() {
		assertEquals("http://www.sungzamorano.com", customers.get(1424).getWeb());
	}
}
