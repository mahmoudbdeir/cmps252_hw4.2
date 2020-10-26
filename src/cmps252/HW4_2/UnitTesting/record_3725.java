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

@Tag("4")
class Record_3725 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3725: FirstName is Andrew")
	void FirstNameOfRecord3725() {
		assertEquals("Andrew", customers.get(3724).getFirstName());
	}

	@Test
	@DisplayName("Record 3725: LastName is Freudenberg")
	void LastNameOfRecord3725() {
		assertEquals("Freudenberg", customers.get(3724).getLastName());
	}

	@Test
	@DisplayName("Record 3725: Company is Lucky Heart Cosmetics")
	void CompanyOfRecord3725() {
		assertEquals("Lucky Heart Cosmetics", customers.get(3724).getCompany());
	}

	@Test
	@DisplayName("Record 3725: Address is 918 Smith St  #-h")
	void AddressOfRecord3725() {
		assertEquals("918 Smith St  #-h", customers.get(3724).getAddress());
	}

	@Test
	@DisplayName("Record 3725: City is Honolulu")
	void CityOfRecord3725() {
		assertEquals("Honolulu", customers.get(3724).getCity());
	}

	@Test
	@DisplayName("Record 3725: County is Honolulu")
	void CountyOfRecord3725() {
		assertEquals("Honolulu", customers.get(3724).getCounty());
	}

	@Test
	@DisplayName("Record 3725: State is HI")
	void StateOfRecord3725() {
		assertEquals("HI", customers.get(3724).getState());
	}

	@Test
	@DisplayName("Record 3725: ZIP is 96817")
	void ZIPOfRecord3725() {
		assertEquals("96817", customers.get(3724).getZIP());
	}

	@Test
	@DisplayName("Record 3725: Phone is 808-949-7233")
	void PhoneOfRecord3725() {
		assertEquals("808-949-7233", customers.get(3724).getPhone());
	}

	@Test
	@DisplayName("Record 3725: Fax is 808-949-9748")
	void FaxOfRecord3725() {
		assertEquals("808-949-9748", customers.get(3724).getFax());
	}

	@Test
	@DisplayName("Record 3725: Email is andrew@freudenberg.com")
	void EmailOfRecord3725() {
		assertEquals("andrew@freudenberg.com", customers.get(3724).getEmail());
	}

	@Test
	@DisplayName("Record 3725: Web is http://www.andrewfreudenberg.com")
	void WebOfRecord3725() {
		assertEquals("http://www.andrewfreudenberg.com", customers.get(3724).getWeb());
	}
}
