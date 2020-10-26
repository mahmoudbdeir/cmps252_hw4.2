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

@Tag("26")
class Record_1795 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1795: FirstName is Brian")
	void FirstNameOfRecord1795() {
		assertEquals("Brian", customers.get(1794).getFirstName());
	}

	@Test
	@DisplayName("Record 1795: LastName is Bininger")
	void LastNameOfRecord1795() {
		assertEquals("Bininger", customers.get(1794).getLastName());
	}

	@Test
	@DisplayName("Record 1795: Company is Surrogate Parenting Inc Ctr")
	void CompanyOfRecord1795() {
		assertEquals("Surrogate Parenting Inc Ctr", customers.get(1794).getCompany());
	}

	@Test
	@DisplayName("Record 1795: Address is 537 S Flores St")
	void AddressOfRecord1795() {
		assertEquals("537 S Flores St", customers.get(1794).getAddress());
	}

	@Test
	@DisplayName("Record 1795: City is San Antonio")
	void CityOfRecord1795() {
		assertEquals("San Antonio", customers.get(1794).getCity());
	}

	@Test
	@DisplayName("Record 1795: County is Bexar")
	void CountyOfRecord1795() {
		assertEquals("Bexar", customers.get(1794).getCounty());
	}

	@Test
	@DisplayName("Record 1795: State is TX")
	void StateOfRecord1795() {
		assertEquals("TX", customers.get(1794).getState());
	}

	@Test
	@DisplayName("Record 1795: ZIP is 78204")
	void ZIPOfRecord1795() {
		assertEquals("78204", customers.get(1794).getZIP());
	}

	@Test
	@DisplayName("Record 1795: Phone is 210-224-2709")
	void PhoneOfRecord1795() {
		assertEquals("210-224-2709", customers.get(1794).getPhone());
	}

	@Test
	@DisplayName("Record 1795: Fax is 210-224-5853")
	void FaxOfRecord1795() {
		assertEquals("210-224-5853", customers.get(1794).getFax());
	}

	@Test
	@DisplayName("Record 1795: Email is brian@bininger.com")
	void EmailOfRecord1795() {
		assertEquals("brian@bininger.com", customers.get(1794).getEmail());
	}

	@Test
	@DisplayName("Record 1795: Web is http://www.brianbininger.com")
	void WebOfRecord1795() {
		assertEquals("http://www.brianbininger.com", customers.get(1794).getWeb());
	}
}
