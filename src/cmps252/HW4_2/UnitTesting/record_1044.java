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

@Tag("30")
class Record_1044 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1044: FirstName is Lakesha")
	void FirstNameOfRecord1044() {
		assertEquals("Lakesha", customers.get(1043).getFirstName());
	}

	@Test
	@DisplayName("Record 1044: LastName is Helley")
	void LastNameOfRecord1044() {
		assertEquals("Helley", customers.get(1043).getLastName());
	}

	@Test
	@DisplayName("Record 1044: Company is Precision Products Co")
	void CompanyOfRecord1044() {
		assertEquals("Precision Products Co", customers.get(1043).getCompany());
	}

	@Test
	@DisplayName("Record 1044: Address is 1705 E Cumberland St")
	void AddressOfRecord1044() {
		assertEquals("1705 E Cumberland St", customers.get(1043).getAddress());
	}

	@Test
	@DisplayName("Record 1044: City is Lebanon")
	void CityOfRecord1044() {
		assertEquals("Lebanon", customers.get(1043).getCity());
	}

	@Test
	@DisplayName("Record 1044: County is Lebanon")
	void CountyOfRecord1044() {
		assertEquals("Lebanon", customers.get(1043).getCounty());
	}

	@Test
	@DisplayName("Record 1044: State is PA")
	void StateOfRecord1044() {
		assertEquals("PA", customers.get(1043).getState());
	}

	@Test
	@DisplayName("Record 1044: ZIP is 17042")
	void ZIPOfRecord1044() {
		assertEquals("17042", customers.get(1043).getZIP());
	}

	@Test
	@DisplayName("Record 1044: Phone is 717-274-6160")
	void PhoneOfRecord1044() {
		assertEquals("717-274-6160", customers.get(1043).getPhone());
	}

	@Test
	@DisplayName("Record 1044: Fax is 717-274-5843")
	void FaxOfRecord1044() {
		assertEquals("717-274-5843", customers.get(1043).getFax());
	}

	@Test
	@DisplayName("Record 1044: Email is lakesha@helley.com")
	void EmailOfRecord1044() {
		assertEquals("lakesha@helley.com", customers.get(1043).getEmail());
	}

	@Test
	@DisplayName("Record 1044: Web is http://www.lakeshahelley.com")
	void WebOfRecord1044() {
		assertEquals("http://www.lakeshahelley.com", customers.get(1043).getWeb());
	}
}
