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

@Tag("20")
class Record_4272 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4272: FirstName is Vesta")
	void FirstNameOfRecord4272() {
		assertEquals("Vesta", customers.get(4271).getFirstName());
	}

	@Test
	@DisplayName("Record 4272: LastName is Vaiko")
	void LastNameOfRecord4272() {
		assertEquals("Vaiko", customers.get(4271).getLastName());
	}

	@Test
	@DisplayName("Record 4272: Company is Life Action Ministries")
	void CompanyOfRecord4272() {
		assertEquals("Life Action Ministries", customers.get(4271).getCompany());
	}

	@Test
	@DisplayName("Record 4272: Address is 1 E Franklin St")
	void AddressOfRecord4272() {
		assertEquals("1 E Franklin St", customers.get(4271).getAddress());
	}

	@Test
	@DisplayName("Record 4272: City is Baltimore")
	void CityOfRecord4272() {
		assertEquals("Baltimore", customers.get(4271).getCity());
	}

	@Test
	@DisplayName("Record 4272: County is Baltimore City")
	void CountyOfRecord4272() {
		assertEquals("Baltimore City", customers.get(4271).getCounty());
	}

	@Test
	@DisplayName("Record 4272: State is MD")
	void StateOfRecord4272() {
		assertEquals("MD", customers.get(4271).getState());
	}

	@Test
	@DisplayName("Record 4272: ZIP is 21202")
	void ZIPOfRecord4272() {
		assertEquals("21202", customers.get(4271).getZIP());
	}

	@Test
	@DisplayName("Record 4272: Phone is 410-576-8870")
	void PhoneOfRecord4272() {
		assertEquals("410-576-8870", customers.get(4271).getPhone());
	}

	@Test
	@DisplayName("Record 4272: Fax is 410-576-2977")
	void FaxOfRecord4272() {
		assertEquals("410-576-2977", customers.get(4271).getFax());
	}

	@Test
	@DisplayName("Record 4272: Email is vesta@vaiko.com")
	void EmailOfRecord4272() {
		assertEquals("vesta@vaiko.com", customers.get(4271).getEmail());
	}

	@Test
	@DisplayName("Record 4272: Web is http://www.vestavaiko.com")
	void WebOfRecord4272() {
		assertEquals("http://www.vestavaiko.com", customers.get(4271).getWeb());
	}
}
