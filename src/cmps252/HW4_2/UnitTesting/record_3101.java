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

@Tag("8")
class Record_3101 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3101: FirstName is Alberto")
	void FirstNameOfRecord3101() {
		assertEquals("Alberto", customers.get(3100).getFirstName());
	}

	@Test
	@DisplayName("Record 3101: LastName is Florence")
	void LastNameOfRecord3101() {
		assertEquals("Florence", customers.get(3100).getLastName());
	}

	@Test
	@DisplayName("Record 3101: Company is North Coast Energy Svc Inc")
	void CompanyOfRecord3101() {
		assertEquals("North Coast Energy Svc Inc", customers.get(3100).getCompany());
	}

	@Test
	@DisplayName("Record 3101: Address is 201 Kings Hwy Sh")
	void AddressOfRecord3101() {
		assertEquals("201 Kings Hwy Sh", customers.get(3100).getAddress());
	}

	@Test
	@DisplayName("Record 3101: City is Cherry Hill")
	void CityOfRecord3101() {
		assertEquals("Cherry Hill", customers.get(3100).getCity());
	}

	@Test
	@DisplayName("Record 3101: County is Camden")
	void CountyOfRecord3101() {
		assertEquals("Camden", customers.get(3100).getCounty());
	}

	@Test
	@DisplayName("Record 3101: State is NJ")
	void StateOfRecord3101() {
		assertEquals("NJ", customers.get(3100).getState());
	}

	@Test
	@DisplayName("Record 3101: ZIP is 8034")
	void ZIPOfRecord3101() {
		assertEquals("8034", customers.get(3100).getZIP());
	}

	@Test
	@DisplayName("Record 3101: Phone is 856-427-5810")
	void PhoneOfRecord3101() {
		assertEquals("856-427-5810", customers.get(3100).getPhone());
	}

	@Test
	@DisplayName("Record 3101: Fax is 856-427-1099")
	void FaxOfRecord3101() {
		assertEquals("856-427-1099", customers.get(3100).getFax());
	}

	@Test
	@DisplayName("Record 3101: Email is alberto@florence.com")
	void EmailOfRecord3101() {
		assertEquals("alberto@florence.com", customers.get(3100).getEmail());
	}

	@Test
	@DisplayName("Record 3101: Web is http://www.albertoflorence.com")
	void WebOfRecord3101() {
		assertEquals("http://www.albertoflorence.com", customers.get(3100).getWeb());
	}
}
