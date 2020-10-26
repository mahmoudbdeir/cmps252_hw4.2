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

@Tag("16")
class Record_4754 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4754: FirstName is Alyssa")
	void FirstNameOfRecord4754() {
		assertEquals("Alyssa", customers.get(4753).getFirstName());
	}

	@Test
	@DisplayName("Record 4754: LastName is Gotay")
	void LastNameOfRecord4754() {
		assertEquals("Gotay", customers.get(4753).getLastName());
	}

	@Test
	@DisplayName("Record 4754: Company is Facstore")
	void CompanyOfRecord4754() {
		assertEquals("Facstore", customers.get(4753).getCompany());
	}

	@Test
	@DisplayName("Record 4754: Address is 1716 S Broadway")
	void AddressOfRecord4754() {
		assertEquals("1716 S Broadway", customers.get(4753).getAddress());
	}

	@Test
	@DisplayName("Record 4754: City is Saint Louis")
	void CityOfRecord4754() {
		assertEquals("Saint Louis", customers.get(4753).getCity());
	}

	@Test
	@DisplayName("Record 4754: County is Saint Louis City")
	void CountyOfRecord4754() {
		assertEquals("Saint Louis City", customers.get(4753).getCounty());
	}

	@Test
	@DisplayName("Record 4754: State is MO")
	void StateOfRecord4754() {
		assertEquals("MO", customers.get(4753).getState());
	}

	@Test
	@DisplayName("Record 4754: ZIP is 63104")
	void ZIPOfRecord4754() {
		assertEquals("63104", customers.get(4753).getZIP());
	}

	@Test
	@DisplayName("Record 4754: Phone is 314-645-0593")
	void PhoneOfRecord4754() {
		assertEquals("314-645-0593", customers.get(4753).getPhone());
	}

	@Test
	@DisplayName("Record 4754: Fax is 314-645-2802")
	void FaxOfRecord4754() {
		assertEquals("314-645-2802", customers.get(4753).getFax());
	}

	@Test
	@DisplayName("Record 4754: Email is alyssa@gotay.com")
	void EmailOfRecord4754() {
		assertEquals("alyssa@gotay.com", customers.get(4753).getEmail());
	}

	@Test
	@DisplayName("Record 4754: Web is http://www.alyssagotay.com")
	void WebOfRecord4754() {
		assertEquals("http://www.alyssagotay.com", customers.get(4753).getWeb());
	}
}
