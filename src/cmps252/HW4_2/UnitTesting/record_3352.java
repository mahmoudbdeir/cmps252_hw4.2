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

@Tag("31")
class Record_3352 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3352: FirstName is Rocky")
	void FirstNameOfRecord3352() {
		assertEquals("Rocky", customers.get(3351).getFirstName());
	}

	@Test
	@DisplayName("Record 3352: LastName is Popovich")
	void LastNameOfRecord3352() {
		assertEquals("Popovich", customers.get(3351).getLastName());
	}

	@Test
	@DisplayName("Record 3352: Company is Avalon Plumbing & Heating")
	void CompanyOfRecord3352() {
		assertEquals("Avalon Plumbing & Heating", customers.get(3351).getCompany());
	}

	@Test
	@DisplayName("Record 3352: Address is 2900 E Richmond St")
	void AddressOfRecord3352() {
		assertEquals("2900 E Richmond St", customers.get(3351).getAddress());
	}

	@Test
	@DisplayName("Record 3352: City is Shawano")
	void CityOfRecord3352() {
		assertEquals("Shawano", customers.get(3351).getCity());
	}

	@Test
	@DisplayName("Record 3352: County is Shawano")
	void CountyOfRecord3352() {
		assertEquals("Shawano", customers.get(3351).getCounty());
	}

	@Test
	@DisplayName("Record 3352: State is WI")
	void StateOfRecord3352() {
		assertEquals("WI", customers.get(3351).getState());
	}

	@Test
	@DisplayName("Record 3352: ZIP is 54166")
	void ZIPOfRecord3352() {
		assertEquals("54166", customers.get(3351).getZIP());
	}

	@Test
	@DisplayName("Record 3352: Phone is 715-526-9429")
	void PhoneOfRecord3352() {
		assertEquals("715-526-9429", customers.get(3351).getPhone());
	}

	@Test
	@DisplayName("Record 3352: Fax is 715-526-3817")
	void FaxOfRecord3352() {
		assertEquals("715-526-3817", customers.get(3351).getFax());
	}

	@Test
	@DisplayName("Record 3352: Email is rocky@popovich.com")
	void EmailOfRecord3352() {
		assertEquals("rocky@popovich.com", customers.get(3351).getEmail());
	}

	@Test
	@DisplayName("Record 3352: Web is http://www.rockypopovich.com")
	void WebOfRecord3352() {
		assertEquals("http://www.rockypopovich.com", customers.get(3351).getWeb());
	}
}
