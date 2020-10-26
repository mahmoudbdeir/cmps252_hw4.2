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

@Tag("29")
class Record_1535 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1535: FirstName is Elvira")
	void FirstNameOfRecord1535() {
		assertEquals("Elvira", customers.get(1534).getFirstName());
	}

	@Test
	@DisplayName("Record 1535: LastName is Ulbricht")
	void LastNameOfRecord1535() {
		assertEquals("Ulbricht", customers.get(1534).getLastName());
	}

	@Test
	@DisplayName("Record 1535: Company is Madison Books & Computers/tcbc")
	void CompanyOfRecord1535() {
		assertEquals("Madison Books & Computers/tcbc", customers.get(1534).getCompany());
	}

	@Test
	@DisplayName("Record 1535: Address is 1021 Ridge Ave")
	void AddressOfRecord1535() {
		assertEquals("1021 Ridge Ave", customers.get(1534).getAddress());
	}

	@Test
	@DisplayName("Record 1535: City is Philadelphia")
	void CityOfRecord1535() {
		assertEquals("Philadelphia", customers.get(1534).getCity());
	}

	@Test
	@DisplayName("Record 1535: County is Philadelphia")
	void CountyOfRecord1535() {
		assertEquals("Philadelphia", customers.get(1534).getCounty());
	}

	@Test
	@DisplayName("Record 1535: State is PA")
	void StateOfRecord1535() {
		assertEquals("PA", customers.get(1534).getState());
	}

	@Test
	@DisplayName("Record 1535: ZIP is 19123")
	void ZIPOfRecord1535() {
		assertEquals("19123", customers.get(1534).getZIP());
	}

	@Test
	@DisplayName("Record 1535: Phone is 215-236-3688")
	void PhoneOfRecord1535() {
		assertEquals("215-236-3688", customers.get(1534).getPhone());
	}

	@Test
	@DisplayName("Record 1535: Fax is 215-236-0977")
	void FaxOfRecord1535() {
		assertEquals("215-236-0977", customers.get(1534).getFax());
	}

	@Test
	@DisplayName("Record 1535: Email is elvira@ulbricht.com")
	void EmailOfRecord1535() {
		assertEquals("elvira@ulbricht.com", customers.get(1534).getEmail());
	}

	@Test
	@DisplayName("Record 1535: Web is http://www.elviraulbricht.com")
	void WebOfRecord1535() {
		assertEquals("http://www.elviraulbricht.com", customers.get(1534).getWeb());
	}
}
