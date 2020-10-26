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

@Tag("5")
class Record_4762 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4762: FirstName is Solomon")
	void FirstNameOfRecord4762() {
		assertEquals("Solomon", customers.get(4761).getFirstName());
	}

	@Test
	@DisplayName("Record 4762: LastName is Mutton")
	void LastNameOfRecord4762() {
		assertEquals("Mutton", customers.get(4761).getLastName());
	}

	@Test
	@DisplayName("Record 4762: Company is Almon A Johnson Inc")
	void CompanyOfRecord4762() {
		assertEquals("Almon A Johnson Inc", customers.get(4761).getCompany());
	}

	@Test
	@DisplayName("Record 4762: Address is 9003 Airport Fwy")
	void AddressOfRecord4762() {
		assertEquals("9003 Airport Fwy", customers.get(4761).getAddress());
	}

	@Test
	@DisplayName("Record 4762: City is North Richland Hills")
	void CityOfRecord4762() {
		assertEquals("North Richland Hills", customers.get(4761).getCity());
	}

	@Test
	@DisplayName("Record 4762: County is Tarrant")
	void CountyOfRecord4762() {
		assertEquals("Tarrant", customers.get(4761).getCounty());
	}

	@Test
	@DisplayName("Record 4762: State is TX")
	void StateOfRecord4762() {
		assertEquals("TX", customers.get(4761).getState());
	}

	@Test
	@DisplayName("Record 4762: ZIP is 76180")
	void ZIPOfRecord4762() {
		assertEquals("76180", customers.get(4761).getZIP());
	}

	@Test
	@DisplayName("Record 4762: Phone is 817-577-6286")
	void PhoneOfRecord4762() {
		assertEquals("817-577-6286", customers.get(4761).getPhone());
	}

	@Test
	@DisplayName("Record 4762: Fax is 817-577-7687")
	void FaxOfRecord4762() {
		assertEquals("817-577-7687", customers.get(4761).getFax());
	}

	@Test
	@DisplayName("Record 4762: Email is solomon@mutton.com")
	void EmailOfRecord4762() {
		assertEquals("solomon@mutton.com", customers.get(4761).getEmail());
	}

	@Test
	@DisplayName("Record 4762: Web is http://www.solomonmutton.com")
	void WebOfRecord4762() {
		assertEquals("http://www.solomonmutton.com", customers.get(4761).getWeb());
	}
}
