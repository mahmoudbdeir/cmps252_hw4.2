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

@Tag("18")
class Record_4083 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4083: FirstName is Brianna")
	void FirstNameOfRecord4083() {
		assertEquals("Brianna", customers.get(4082).getFirstName());
	}

	@Test
	@DisplayName("Record 4083: LastName is Salminen")
	void LastNameOfRecord4083() {
		assertEquals("Salminen", customers.get(4082).getLastName());
	}

	@Test
	@DisplayName("Record 4083: Company is Texas Bulk Distributors")
	void CompanyOfRecord4083() {
		assertEquals("Texas Bulk Distributors", customers.get(4082).getCompany());
	}

	@Test
	@DisplayName("Record 4083: Address is 1400 N Fiesta Blvd")
	void AddressOfRecord4083() {
		assertEquals("1400 N Fiesta Blvd", customers.get(4082).getAddress());
	}

	@Test
	@DisplayName("Record 4083: City is Gilbert")
	void CityOfRecord4083() {
		assertEquals("Gilbert", customers.get(4082).getCity());
	}

	@Test
	@DisplayName("Record 4083: County is Maricopa")
	void CountyOfRecord4083() {
		assertEquals("Maricopa", customers.get(4082).getCounty());
	}

	@Test
	@DisplayName("Record 4083: State is AZ")
	void StateOfRecord4083() {
		assertEquals("AZ", customers.get(4082).getState());
	}

	@Test
	@DisplayName("Record 4083: ZIP is 85233")
	void ZIPOfRecord4083() {
		assertEquals("85233", customers.get(4082).getZIP());
	}

	@Test
	@DisplayName("Record 4083: Phone is 480-545-7006")
	void PhoneOfRecord4083() {
		assertEquals("480-545-7006", customers.get(4082).getPhone());
	}

	@Test
	@DisplayName("Record 4083: Fax is 480-545-5593")
	void FaxOfRecord4083() {
		assertEquals("480-545-5593", customers.get(4082).getFax());
	}

	@Test
	@DisplayName("Record 4083: Email is brianna@salminen.com")
	void EmailOfRecord4083() {
		assertEquals("brianna@salminen.com", customers.get(4082).getEmail());
	}

	@Test
	@DisplayName("Record 4083: Web is http://www.briannasalminen.com")
	void WebOfRecord4083() {
		assertEquals("http://www.briannasalminen.com", customers.get(4082).getWeb());
	}
}
