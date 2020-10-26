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

@Tag("14")
class Record_1037 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1037: FirstName is Socorro")
	void FirstNameOfRecord1037() {
		assertEquals("Socorro", customers.get(1036).getFirstName());
	}

	@Test
	@DisplayName("Record 1037: LastName is Stear")
	void LastNameOfRecord1037() {
		assertEquals("Stear", customers.get(1036).getLastName());
	}

	@Test
	@DisplayName("Record 1037: Company is Excel Quantronix Control Laser")
	void CompanyOfRecord1037() {
		assertEquals("Excel Quantronix Control Laser", customers.get(1036).getCompany());
	}

	@Test
	@DisplayName("Record 1037: Address is 62 Railroad Ave")
	void AddressOfRecord1037() {
		assertEquals("62 Railroad Ave", customers.get(1036).getAddress());
	}

	@Test
	@DisplayName("Record 1037: City is East Rutherford")
	void CityOfRecord1037() {
		assertEquals("East Rutherford", customers.get(1036).getCity());
	}

	@Test
	@DisplayName("Record 1037: County is Bergen")
	void CountyOfRecord1037() {
		assertEquals("Bergen", customers.get(1036).getCounty());
	}

	@Test
	@DisplayName("Record 1037: State is NJ")
	void StateOfRecord1037() {
		assertEquals("NJ", customers.get(1036).getState());
	}

	@Test
	@DisplayName("Record 1037: ZIP is 7073")
	void ZIPOfRecord1037() {
		assertEquals("7073", customers.get(1036).getZIP());
	}

	@Test
	@DisplayName("Record 1037: Phone is 201-935-8573")
	void PhoneOfRecord1037() {
		assertEquals("201-935-8573", customers.get(1036).getPhone());
	}

	@Test
	@DisplayName("Record 1037: Fax is 201-935-1778")
	void FaxOfRecord1037() {
		assertEquals("201-935-1778", customers.get(1036).getFax());
	}

	@Test
	@DisplayName("Record 1037: Email is socorro@stear.com")
	void EmailOfRecord1037() {
		assertEquals("socorro@stear.com", customers.get(1036).getEmail());
	}

	@Test
	@DisplayName("Record 1037: Web is http://www.socorrostear.com")
	void WebOfRecord1037() {
		assertEquals("http://www.socorrostear.com", customers.get(1036).getWeb());
	}
}
