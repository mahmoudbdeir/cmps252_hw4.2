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

@Tag("6")
class Record_3746 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3746: FirstName is Alisa")
	void FirstNameOfRecord3746() {
		assertEquals("Alisa", customers.get(3745).getFirstName());
	}

	@Test
	@DisplayName("Record 3746: LastName is Hosten")
	void LastNameOfRecord3746() {
		assertEquals("Hosten", customers.get(3745).getLastName());
	}

	@Test
	@DisplayName("Record 3746: Company is Environ Archl Modelbuilders")
	void CompanyOfRecord3746() {
		assertEquals("Environ Archl Modelbuilders", customers.get(3745).getCompany());
	}

	@Test
	@DisplayName("Record 3746: Address is 5038 Beech St")
	void AddressOfRecord3746() {
		assertEquals("5038 Beech St", customers.get(3745).getAddress());
	}

	@Test
	@DisplayName("Record 3746: City is Cincinnati")
	void CityOfRecord3746() {
		assertEquals("Cincinnati", customers.get(3745).getCity());
	}

	@Test
	@DisplayName("Record 3746: County is Hamilton")
	void CountyOfRecord3746() {
		assertEquals("Hamilton", customers.get(3745).getCounty());
	}

	@Test
	@DisplayName("Record 3746: State is OH")
	void StateOfRecord3746() {
		assertEquals("OH", customers.get(3745).getState());
	}

	@Test
	@DisplayName("Record 3746: ZIP is 45212")
	void ZIPOfRecord3746() {
		assertEquals("45212", customers.get(3745).getZIP());
	}

	@Test
	@DisplayName("Record 3746: Phone is 513-366-2231")
	void PhoneOfRecord3746() {
		assertEquals("513-366-2231", customers.get(3745).getPhone());
	}

	@Test
	@DisplayName("Record 3746: Fax is 513-366-9741")
	void FaxOfRecord3746() {
		assertEquals("513-366-9741", customers.get(3745).getFax());
	}

	@Test
	@DisplayName("Record 3746: Email is alisa@hosten.com")
	void EmailOfRecord3746() {
		assertEquals("alisa@hosten.com", customers.get(3745).getEmail());
	}

	@Test
	@DisplayName("Record 3746: Web is http://www.alisahosten.com")
	void WebOfRecord3746() {
		assertEquals("http://www.alisahosten.com", customers.get(3745).getWeb());
	}
}
